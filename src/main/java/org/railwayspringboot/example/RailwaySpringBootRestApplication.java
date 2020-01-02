package org.railwayspringboot.example;

//import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.ApplicationContext;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"org.railwayspringboot.controller","org.railwayspringboot.model"})
public class RailwaySpringBootRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(RailwaySpringBootRestApplication.class, args);
		 
		/*
		 * String[] beanNames = ctx.getBeanDefinitionNames(); Arrays.sort(beanNames);
		 * 
		 * for (String beanName : beanNames) { System.out.println(beanName); }
		 */
	}

}
