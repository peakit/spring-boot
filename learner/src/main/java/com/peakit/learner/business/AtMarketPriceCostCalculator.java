package com.peakit.learner.business;

import java.math.BigDecimal;

import com.peakit.learner.domain.Course;
import com.peakit.learner.domain.Learner;

public class AtMarketPriceCostCalculator implements CostCalculator {

	@Override
	public BigDecimal calculateCost(Learner learner, Course course) {
		return course.getFees();
	}

}
