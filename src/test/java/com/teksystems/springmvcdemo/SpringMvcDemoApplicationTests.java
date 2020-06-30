package com.teksystems.springmvcdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMvcDemoApplicationTests {

	private MockMvc mockMvc;
	private WebApplicationContext wac;

//	@Test
//	public void contextLoads() {

	@Before
	public void setup() {
		DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
		this.mockMvc = builder.build();
	}

//}

	@Test
	public void testMyMvcController() throws Exception {
		ResultMatcher ok = MockMvcResultMatchers.status().isOk();
		ResultMatcher msg = MockMvcResultMatchers.model()
				.attribute("msg", "Spring quick start!!");

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/");
		this.mockMvc.perform(builder)
				.andExpect(ok)
				.andExpect(msg);
	}

}
