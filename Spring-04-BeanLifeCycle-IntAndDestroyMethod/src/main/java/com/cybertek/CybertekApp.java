package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course= container.getBean("java", Course.class); //container create java object then give it to me

        course.getTeachingHours();

        //it will first show init method
        //then other called method will shown

        // to see the destroy method---> I need to close the container
        ( (ClassPathXmlApplicationContext)container).close();

        //now after close the container---> you can see destroy method
    }
}
