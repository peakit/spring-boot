package com.peakit.api;

import com.peakit.dao.Datasource;
import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public class SubscriptionServiceImpl implements SubscriptionService {

	private Datasource ds;

	@Override
	public void subscribe(Learner learner, Course course) {
		ds.subscribe(learner, course);
	}
}
