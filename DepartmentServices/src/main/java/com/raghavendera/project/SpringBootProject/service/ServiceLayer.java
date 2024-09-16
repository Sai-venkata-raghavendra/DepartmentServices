package com.raghavendera.project.SpringBootProject.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghavendera.project.SpringBootProject.entity.Entitys;
import com.raghavendera.project.SpringBootProject.error.EntityNotFoundException;
import com.raghavendera.project.SpringBootProject.repository.SalaryRepository;

@Service
public class ServiceLayer implements DepartmentSer {

	@Autowired
	private SalaryRepository salaryRepository;
	@Override
	public Entitys saveDetailsInto(Entitys entitys) {
		return salaryRepository.save(entitys);
	}
	@Override
	public List<Entitys> getDetails() {
		return salaryRepository.findAll();
	}
	@Override
	public Entitys getDetailsbyid(Long id) throws EntityNotFoundException {
		Optional<Entitys> salaryDb = salaryRepository.findById(id);
		if(!salaryDb.isPresent())
		{
			throw new EntityNotFoundException("As the Particular user is not found");
		}
		return salaryDb.get();
		
	}
	
	public void getDetailsbyEmployee(Long id) {
		salaryRepository.deleteById(id);
	}
	@Override
	public Entitys updateTheDetails(Long id, Entitys entitys) {
				Entitys entity = salaryRepository.findById(id).get();
		
		if(Objects.nonNull(entitys.getName())&&
				!"".equalsIgnoreCase(entitys.getName()))
		{
			entity.setName(entitys.getName());
		}
		if(Objects.nonNull(entitys.getCity())&&
				!"".equalsIgnoreCase(entitys.getCity()))
		{
			entity.setCity(entitys.getCity());
		}
		if(Objects.nonNull(entitys.getAge()))
		{
			entity.setAge(entitys.getAge());
		}
		if(Objects.nonNull(entitys.getSalary()))
		{
			entity.setSalary(entitys.getSalary());
		}
		return salaryRepository.save(entity);
	}
	@Override
	public Entitys getDetailsByName(String name) {
		
		return salaryRepository.findByName(name);
	}
	
	

}
