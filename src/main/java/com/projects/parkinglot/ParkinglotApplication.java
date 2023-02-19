package com.projects.parkinglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkinglotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

	/**
	 * java -cp /home/oem/Documents/Projects/jars/h2-2.1.214.jar org.h2.tools.Shell -url "jdbc:h2:mem:test" -driver "org.h2.Driver" -user "" -password ""
	 * git config user.email "subrato.mondal18@gmail.com"
	 * git config user.name "Subrato92"
	 * ssh-keygen -t rsa -b 4096 -C "subrato.mondal18@gmail.com"
	 */

}
