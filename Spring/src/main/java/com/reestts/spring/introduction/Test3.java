package com.reestts.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println(person.getLastname());
        System.out.println(person.getAge());

        context.close();
    }
}
