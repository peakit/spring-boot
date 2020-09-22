package com.peakit.api;

public interface DiscountService {
	void addOrUpdateDisc(Double discPct);

	Double discount();
}
