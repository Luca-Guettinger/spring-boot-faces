package com.auth0.samples.bootfaces.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class Initializer implements ServletContextInitializer, ServletContextAware {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
		sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration",
				Boolean.TRUE.toString());
		servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
	}
}
