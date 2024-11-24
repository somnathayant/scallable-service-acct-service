package com.ms.ACCTSERVICE.service;

import java.util.List;

import com.ms.ACCTSERVICE.dto.Data;





public interface AcctService {

	List<Data>getAll(Data ob);
	Data getAcctById(Integer Id);
	Data saveAcctData(Data ob);
}
