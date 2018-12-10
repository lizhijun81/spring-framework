package org.lizj.beans.ioc.bean.factory;

import org.lizj.beans.ioc.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestXmlBeanFactory {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org.lizj/bean.factory/beans.xml"));

        Person person = (Person) beanFactory.getBean("person");
//        Person person_1 = (Person) beanFactory.getBean("person");

        System.out.println(person.toString());
//        System.out.println(person_1);

//        Person person_11 = (Person) beanFactory.getBean("person_1");
//        System.out.println(person_11.getName() + "==" + person_11);
//
//        person_11 = (Person) beanFactory.getBean("person_1");
//        System.out.println(person_11.getName() + "==" + person_11);
    }

}
