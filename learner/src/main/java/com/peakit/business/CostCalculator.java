package com.peakit.business;

import java.math.BigDecimal;

import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public interface CostCalculator {

	BigDecimal calculateCost(Learner learner, Course course);
}
