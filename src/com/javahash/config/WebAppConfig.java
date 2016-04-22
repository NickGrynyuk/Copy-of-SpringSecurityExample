package com.javahash.config;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebAppConfig extends WebMvcConfigurerAdapter{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	}
	 @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/login").setViewName("login");
	        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    }
}
