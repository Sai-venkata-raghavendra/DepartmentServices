package com.raghavendera.project.SpringBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghavendera.project.SpringBootProject.entity.Entitys;
import com.raghavendera.project.SpringBootProject.error.EntityNotFoundException;
import com.raghavendera.project.SpringBootProject.service.DepartmentSer;

@RestController
public class DepartmentCOntroller {
	
	@Autowired
	private DepartmentSer departmentSer;

	@PostMapping(value = "/employees")
	public Entitys saveDetailsInto(@RequestBody Entitys entitys) {
		return departmentSer.saveDetailsInto(entitys);
	}
	
	@GetMapping(value = "/empdetails")
	public List<Entitys> getDetails(){
		return departmentSer.getDetails();
	}

	@GetMapping(value = "/empdetails/id/{id}")
	public Entitys getDetailsbyid(@PathVariable("id") Long id) throws EntityNotFoundException{
		
		return departmentSer.getDetailsbyid(id);
		
	}
	
	@DeleteMapping(value = "/empdetails/{id}")
	public String getDetailsbyEmployee(@PathVariable Long id){
		 departmentSer.getDetailsbyEmployee(id);
		 return "Record has deleted Succesfully";
	}
	
	@PutMapping(value ="/update/{id}")
	public Entitys updateTheDetails(@PathVariable Long id, @RequestBody Entitys entitys) {
		return departmentSer.updateTheDetails(id,entitys);
		
	}
	
	@GetMapping("/empdetails/{name}")
	public Entitys getDetailsByName(@PathVariable("name") String name) {
		
		return departmentSer.getDetailsByName(name);
		
	}
}
