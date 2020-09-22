package com.peakit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peakit.dao.Datasource;

@RestController
public class DiscountServiceImpl implements DiscountService {

	private Datasource ds;

	@Override
	@PutMapping("/discount/{pct}")
	public void addOrUpdateDisc(@PathVariable Double discPct) {
		ds.addSaleDayDiscount(discPct);
	}

	@Override
	@GetMapping("/discount")
	public Double discount() {
		System.out.println("Hello..");
		return ds.getSaleDayDiscount();
	}

}
