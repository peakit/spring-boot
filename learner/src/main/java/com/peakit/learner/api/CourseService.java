package com.peakit.learner.api;

import java.math.BigDecimal;

public interface CourseService {

	void addCourse(Integer id, String name, String description, BigDecimal fees);
}
