package com.ms.ACCTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.ACCTSERVICE.pojo.Emp;



@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer>{

}
