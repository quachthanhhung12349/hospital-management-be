package com.uetbtlcsdl.hospital_management_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.uetbtlcsdl.hospital_management_be.controller.ForumController;
import com.uetbtlcsdl.hospital_management_be.service.IForumService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.uetbtlcsdl.hospital_management_be.service", "com.uetbtlcsdl.hospital_management_be.service.impl", "com.uetbtlcsdl.hospital_management_be.dao", "com.uetbtlcsdl.hospital_management_be.controller"})
@ComponentScan(basePackageClasses = {ForumController.class, IForumService.class})
@EnableSwagger2
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

}
