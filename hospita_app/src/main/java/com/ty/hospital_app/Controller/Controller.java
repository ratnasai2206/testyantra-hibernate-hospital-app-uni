package com.ty.hospital_app.Controller;

import com.ty.hospital_app.Dao.BranchDao;
import com.ty.hospital_app.Dao.HospitalDao;
import com.ty.hospital_app.entity.Branch;
import com.ty.hospital_app.entityFactoryHelper.BranchHelper;

public class Controller {

	public static void main(String[] args) {
		HospitalDao hospitalDao = new HospitalDao();
//		Hospital hospital=hospitalDao.saveHospital(HospitalHelper.getHospital());
//		System.out.println(hospital);
		BranchDao branchDao = new BranchDao();
//
		Branch branch = branchDao.saveBranch(BranchHelper.getBranch(),"h101");
		System.out.println(branch);

//		Hospital hospital = hospitalDao.searchHospital("h101");
//		System.out.println(hospital);
//		Branch branch = branchDao.searchBranch("b101");
//		System.out.println(branch);
	}
}
