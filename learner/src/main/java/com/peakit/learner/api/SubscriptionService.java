package com.peakit.learner.api;

import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

public interface SubscriptionService {
	void subscribe(Learner learner, Course course);
}
