package com.ms.ACCTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.ACCTSERVICE.pojo.Address;



@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
