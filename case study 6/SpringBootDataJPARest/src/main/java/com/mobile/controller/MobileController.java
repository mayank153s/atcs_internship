package com.mobile.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/Mobile")// http://localhost:8626/Mobile

public class MobileController {
	

	

	
		@Autowired
		MobileService service;

		@PostMapping("/addMobile") // http://localhost:8626/Mobile/addMobile
		public Mobile addMobile(@RequestBody Mobile mb)
		{
			
			return service.addMobile(mb);
			
		}
		
		@PutMapping("/updateMobile") // http://localhost:8626/Mobile/updateMobile
		public Mobile updateMobile(@RequestBody Mobile mb)
		{
			
			return service.updateMobile(mb);
			
		}
		
		@GetMapping("/getMobile/{mid}") // http://localhost:8626/Mobile/getMobile/mid
		public Optional<Mobile> getMobile(@PathVariable("mid") int mbId)
		{
			
			return service.getMobile(mbId);
			
		}
		
		@GetMapping("/getAllMobile") // http://localhost:8626/Mobile/getAllMobile
		public Iterable<Mobile> getAllMobiles()
		{
			
			return service.getAllMobiles();
			
		}
		
		@DeleteMapping("/deleteMobile/{mid}") // http://localhost:8626/Mobile/deleteMobile/mid
		public void deleteMobile(@PathVariable("mid") int mbId)
		{
			
			 service.deleteMobile(mbId);
			
		}
		
		
	}
