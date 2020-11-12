package com.curvebuilder;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurveBuilderApplicationTests {

	private static final Logger LOG  = LoggerFactory.getLogger(CurveBuilderApplicationTests.class);

	@Test
	void contextLoads() {
		LOG.info("yo");
	}

}
