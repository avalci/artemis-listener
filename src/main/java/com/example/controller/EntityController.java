package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

	@Autowired
	private EntityRepository er;

	@GetMapping("entities")
	public List<EntityDTO> list() {
		List<EntityDTO> result = new ArrayList<>();
		er.findAll().forEach(result::add);
		return result;
	}
}
