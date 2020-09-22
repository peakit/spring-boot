package com.peakit.business;

import java.math.BigDecimal;

import com.peakit.domain.Course;
import com.peakit.domain.Learner;

public class AtMarketPriceCostCalculator implements CostCalculator {

	@Override
	public BigDecimal calculateCost(Learner learner, Course course) {
		return course.getFees();
	}

}
