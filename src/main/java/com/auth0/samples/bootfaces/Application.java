package com.auth0.samples.bootfaces;

import com.auth0.samples.bootfaces.config.Initializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.faces.webapp.FacesServlet;

@SpringBootApplication(scanBasePackages = {"com.auth0.samples.bootfaces"})
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(Application.class, Initializer.class);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		ServletRegistrationBean servletRegistrationBean
				= new ServletRegistrationBean(servlet, "*.xhtml");
		return servletRegistrationBean;
	}
}
