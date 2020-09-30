package com.peakit.learnerreverseproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.peakit.learnerreverseproxy.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class LearnerReverseProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnerReverseProxyApplication.class, args);
	}

	@Bean
	public SimpleFilter simplFilter() {
		return new SimpleFilter();
	}

}
