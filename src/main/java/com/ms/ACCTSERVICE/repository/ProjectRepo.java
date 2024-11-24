package com.ms.ACCTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.ACCTSERVICE.pojo.Project;





@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer>{

}
