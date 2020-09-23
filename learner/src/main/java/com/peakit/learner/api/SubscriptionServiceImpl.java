package com.peakit.learner.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.learner.dao.Datasource;
import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

@RestController
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	private Datasource ds;

	@Override
	@PutMapping
	public void subscribe(@RequestParam Learner learner, @RequestParam Course course) {
		ds.subscribe(learner, course);
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}

}
