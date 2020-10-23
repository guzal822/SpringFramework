package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // scope="singleton"
        Course course1 = container.getBean("java", Course.class); //container create java object then give it to me

        Course course2 = container.getBean("java", Course.class);

        //compare result
        System.out.println("pointing to the same object ?: " + (course1 == course2));
        System.out.println("memory location of course1: " + course1);
        System.out.println("memory location of course2: " + course2);

        //result: course1 and course2 are using the same bean-----singleton

 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

        // scope="prototype"
        Course course3 = container.getBean("selenium", Course.class); //container create java object then give it to me

        Course course4 = container.getBean("selenium", Course.class);

        //compare result
        System.out.println("pointing to the same object ?: " + (course3 == course4));
        System.out.println("memory location of course3: " + course3);
        System.out.println("memory location of course4: " + course4);

        //result: course1 and course2 not using the same bean-----prototype
    }
}
