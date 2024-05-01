package com.jpa.test.durgeshjpa;

import com.jpa.test.durgeshjpa.entities.User;
import com.jpa.test.durgeshjpa.entities.UserRepository;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DurgeshjpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(DurgeshjpaApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);

		User user=new User();
		user.setName("Ram");
		user.setCity("lalitpur");
		user.setStatus("i am developer");

		 User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
