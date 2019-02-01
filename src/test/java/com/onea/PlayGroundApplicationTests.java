package com.onea;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.onea.playground.PlayGroundApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PlayGroundApplication.class)
@WebAppConfiguration
public class PlayGroundApplicationTests {

	@Test
	public void contextLoads() {
	}

}
