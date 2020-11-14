package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext container=SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

		Course course = container.getBean("java",Course.class);

		System.out.println(course.getTeachingHours());
	}

}
