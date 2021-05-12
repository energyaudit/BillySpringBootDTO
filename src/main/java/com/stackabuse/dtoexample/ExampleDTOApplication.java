package com.stackabuse.dtoexample;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleDTOApplication {
	//At this point, we'd want to make a controller that handles a GET request and returns a list of user's
	// locations. Though, if we retrieve User and Location objects from our database, and simply print the
	// required information - the other information, such as the password will also be contained in that object.
	// We won't print it, but it'll be there
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	public static void main(String[] args) {
		 SpringApplication.run(ExampleDTOApplication.class, args);
	}

}
