package com.peakit.learner.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.learner.dao.Datasource;

@RestController
public class DiscountServiceImpl implements DiscountService {

	@Autowired
	private Datasource ds;

	@Override
	@PostMapping(path = "/discount")
	public void addDisc(@RequestParam(name = "discPct") Double discPct) {
		ds.addSaleDayDiscount(discPct);
	}

	@Override
	@GetMapping(path = "/discount")
	public Double discount() {
		return ds.getSaleDayDiscount();
	}

	public void setDs(Datasource ds) {
		this.ds = ds;
	}

}
