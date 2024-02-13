package com.ty.hospital_app.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entity.Hospital;

public class BranchDao {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ratna");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	// save the Branch from the branch database
	/*
	 * public Branch saveBranch(Branch branch, String hospital_id) {
	 * 
	 * if (branch != null && hospital_id != null) { Hospital hospital =
	 * entityManager.find(Hospital.class, hospital_id); if (hospital != null) {
	 * List<Branch> branchs = hospital.getBranch();
	 * hospital.setNo_Of_Branch(branchs.size()); Address address =
	 * branch.getAddress(); AddressDao addressDao = new AddressDao();
	 * addressDao.saveAddress(address); entityTransaction.begin();
	 * entityManager.persist(branch); entityTransaction.commit();
	 * branchs.add(branch); hospital.setBranch(branchs); new
	 * HospitalDao().updateHospital(hospital_id, hospital); } }else {
	 * System.out.println("Hospital With the Give Id = "+hospital_id+" Not Found");
	 * } return branch;
	 * 
	 * }
	 */

	public Branch saveBranch(Branch branch, String hospital_id) {
		HospitalDao hospitalDao = new HospitalDao();
		AddressDao addressDao = new AddressDao();
		Hospital hospital = hospitalDao.searchHospital(hospital_id);
		System.err.println(hospital+" = "+hospital_id);
		if (hospital != null) {
			branch.setAddress(addressDao.saveAddress(branch.getAddress()));
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			hospital.getBranch().add(branch);
			hospitalDao.updateHospital(hospital_id, hospital);
			return branch;
		}
		System.out.println("Hospital With the Give Id = " + hospital_id + " Not Found");
		return null;

	}

	// find the Branch from the branch database
	public Branch searchBranch(String branch_Id) {
		return entityManager.find(Branch.class, branch_Id);
	}

	// update Item into Item from database
	public Branch updateBranch(String branch_Id, Branch branch) {
		if (branch_Id.equalsIgnoreCase(branch.getBranch_Id()) && branch != null) {
			entityTransaction.begin();
			entityManager.merge(branch);
			entityTransaction.commit();
		}
		return branch;
	}

	// remove the item from the database
	public boolean removeBranch(String branch_Id) {
		if (branch_Id != null) {
			Branch branch = searchBranch(branch_Id);
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		return false;

	}

}
