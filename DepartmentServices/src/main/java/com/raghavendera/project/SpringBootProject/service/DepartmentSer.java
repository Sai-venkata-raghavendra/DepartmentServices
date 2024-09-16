package com.raghavendera.project.SpringBootProject.service;

import java.util.List;

import com.raghavendera.project.SpringBootProject.entity.Entitys;
import com.raghavendera.project.SpringBootProject.error.EntityNotFoundException;

public interface DepartmentSer {

	public Entitys saveDetailsInto(Entitys entitys);

	public List<Entitys> getDetails();

	public Entitys getDetailsbyid(Long id) throws EntityNotFoundException;

	public void getDetailsbyEmployee(Long id);

	public Entitys updateTheDetails(Long id, Entitys entitys);

	public Entitys getDetailsByName(String name);

	

}
