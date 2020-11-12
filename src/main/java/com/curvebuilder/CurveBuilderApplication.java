package com.curvebuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.curvebuilder" })
public class CurveBuilderApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CurveBuilderApplication.class);

	public static void main(String[] args) {
		LOG.info("Running application...");
		SpringApplicationBuilder builder = new SpringApplicationBuilder(CurveBuilderApplication.class);
		builder.headless(false).run(args);
	}

}
            