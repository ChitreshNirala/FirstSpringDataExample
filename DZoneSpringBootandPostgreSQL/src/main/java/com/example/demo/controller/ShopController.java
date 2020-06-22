package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CoffiShop;
import com.example.demo.repository.ShopRepository;

@RestController
public class ShopController {
	
	@Autowired
	private ShopRepository shopRepository;
	
	@GetMapping("/coffiShop")
	public String coffiCreate() {
		shopRepository.save(new CoffiShop("Nescaffe"));
		
		shopRepository.saveAll(Arrays.asList(new CoffiShop("brue"),
				new CoffiShop("capechino"),
				new CoffiShop( "sunfiest")));
		
		return "coffi saved";
		
	}
	
	@GetMapping("/all")
	public List<CoffiShop> getAllCoffi(){
		
		List<CoffiShop> allcoffi = shopRepository.findAll();
		
		return allcoffi;
		
	}

}
