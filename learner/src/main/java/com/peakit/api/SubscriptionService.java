package com.peakit.api;

import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public interface SubscriptionService {
	void subscribe(Learner learner, Course course);
}
