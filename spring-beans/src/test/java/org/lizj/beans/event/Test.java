//package org.lizj.beans.event;
//
//import beans.event.CustomPublisher;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test {
//
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("event/beans.xml");
//        CustomPublisher customPublisher = applicationContext.getBean(CustomPublisher.class);
//        customPublisher.publish();
//    }
//
//}