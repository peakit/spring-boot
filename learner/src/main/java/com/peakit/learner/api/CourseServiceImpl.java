package com.peakit.learner.api;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.learner.dao.Datasource;

@RestController
public class CourseServiceImpl implements CourseService {

	@Autowired
	private Datasource ds;

	@Override
	@PostMapping
	public void addCourse(@RequestParam Integer id, @RequestParam String name, @RequestParam String description,
			@RequestParam BigDecimal fees) {
		ds.createCourse(id, name, description, fees);
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}

}
