package com.peakit.learner.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.learner.dao.Datasource;

@RestController
public class LearnerServiceImpl implements LearnerService {

	@Autowired
	private Datasource ds;

	@Override
	@PostMapping("/learner")
	public void addLearner(@RequestParam Integer id, @RequestParam String firstName, @RequestParam String lastName) {
		ds.addLearner(id, firstName, lastName);
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}

}
