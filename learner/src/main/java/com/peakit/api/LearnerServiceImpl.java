package com.peakit.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.dao.Datasource;

@RestController
public class LearnerServiceImpl implements LearnerService {

	private Datasource ds;

	@Override
	@PostMapping("/learner")
	public void addLearner(Integer id, String firstName, String lastName) {
		ds.addLearner(id, firstName, lastName);
	}

}
