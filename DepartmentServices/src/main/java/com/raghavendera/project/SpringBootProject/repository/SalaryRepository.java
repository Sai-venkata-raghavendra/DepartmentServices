package com.raghavendera.project.SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghavendera.project.SpringBootProject.entity.Entitys;

@Repository
public interface SalaryRepository extends JpaRepository<Entitys , Long>{

	 public Entitys findByName(String name);

}
