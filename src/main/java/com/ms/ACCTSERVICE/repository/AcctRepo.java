package com.ms.ACCTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.ACCTSERVICE.pojo.Acct;



@Repository
public interface AcctRepo extends JpaRepository<Acct,Integer>{

}
