package com.example.books;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
    // http.headers().frameOptions().deny();
    http.headers().frameOptions().sameOrigin();
		// http.headers().frameOptions().disable().addHeaderWriter(
    //   new StaticHeadersWriter(
    //     "X-Frame-Options",
    //     "allow-from " + "http://localhost/"
    //   )
    // );
	}
}