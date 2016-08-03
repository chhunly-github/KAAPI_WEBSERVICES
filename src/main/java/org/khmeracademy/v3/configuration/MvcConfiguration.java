package org.khmeracademy.v3.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/home");
		registry.addViewController("/home").setViewName("/home");
		registry.addViewController("/about").setViewName("/about");
		registry.addViewController("/admin").setViewName("/admin/admin");
		registry.addViewController("/user").setViewName("/user/user");
		registry.addViewController("/dba").setViewName("/dba");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/access-denied").setViewName("/access-denied");
		registry.addViewController("/swagger").setViewName("/swagger/index");

	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedMethods("GET","POST","DELETE","PUT","OPTIONS","PATCH")
				.allowedOrigins("*");
	}
	
}
