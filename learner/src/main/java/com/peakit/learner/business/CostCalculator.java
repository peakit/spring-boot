package com.peakit.learner.business;

import java.math.BigDecimal;

import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

public interface CostCalculator {

	BigDecimal calculateCost(Learner learner, Course course);
}
