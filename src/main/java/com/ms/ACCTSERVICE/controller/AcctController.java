package com.ms.ACCTSERVICE.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ACCTSERVICE.service.AcctService;
import com.ms.ACCTSERVICE.dto.Data;





@RequestMapping("/ACCT-SERVICE")
@RestController
public class AcctController {

	@Autowired
	private AcctService acctService;
	@GetMapping("/")
	public String ping() {
		return "ok";
	}
	
	@GetMapping("/getAllAcct")
	public ResponseEntity<List<Data>>getAllAcct(){
		List<Data> ob=new ArrayList<Data>();
		
		
		return new ResponseEntity<List<Data>>(ob,HttpStatus.OK);
	}
	
	@PostMapping("/saveAcct")
	public ResponseEntity<Data>saveAcct(@RequestBody Data ob){
		HttpStatus httpStatus=null;
		try {
			ob=acctService.saveAcctData(ob);
			httpStatus=HttpStatus.OK;
		}catch(Exception ex) {
			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		System.out.println("data acct "+ob);
		return new ResponseEntity<Data>(ob,HttpStatus.OK);
	}
}
