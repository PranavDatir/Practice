package day9;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.DispatcherServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;


public class SpringMvcWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		WebApplicationContext webCtx = getContext();
		DispatcherServlet frontControllerServlet = new DispatcherServlet(webCtx);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("frontController", frontControllerServlet);
		dispatcher.addMapping("/"); 
	}

	private WebApplicationContext getContext() {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocations("day9");
		return webCtx;
	}

}
