package com.example.demo;

import com.example.demo.security.ApplicationUserPermission;
import com.example.demo.security.ApplicationUserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args->{
			ApplicationUserPermission applicationUserPermission=ApplicationUserPermission.COURSE_WRITE;
			System.out.println(applicationUserPermission.getPermission());
			System.out.println(applicationUserPermission.name());
			ApplicationUserRole role= ApplicationUserRole.ADMIN;
			System.out.println(role.getPermissions());
			System.out.println(role.name());
		};
	}

}
