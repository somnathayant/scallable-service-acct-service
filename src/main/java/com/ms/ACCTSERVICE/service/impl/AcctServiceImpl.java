package com.ms.ACCTSERVICE.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.ACCTSERVICE.dto.Data;
import com.ms.ACCTSERVICE.pojo.Acct;
import com.ms.ACCTSERVICE.pojo.Address;
import com.ms.ACCTSERVICE.pojo.Emp;
import com.ms.ACCTSERVICE.pojo.Project;
import com.ms.ACCTSERVICE.repository.AcctRepo;
import com.ms.ACCTSERVICE.repository.AddressRepo;
import com.ms.ACCTSERVICE.repository.EmpRepo;
import com.ms.ACCTSERVICE.service.AcctService;

@Service
public class AcctServiceImpl implements AcctService{

	@Autowired
	private AcctRepo acctRepo;
	
	@Override
	public List<Data> getAll(Data ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data getAcctById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Data saveAcctData(Data ob) {
		// TODO Auto-generated method stub
		
		Acct a=new Acct();
		a.setCtc(ob.getCtc());
		a.setDate(new Date());
		a.setSalary(ob.getSalary());
		acctRepo.save(a);
		ob.setAcctId(a.getAcctId());
		 return ob;
	}

}
