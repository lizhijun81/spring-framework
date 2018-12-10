package org.lizj.beans.ioc.beanwarp;

import org.lizj.beans.ioc.Person;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanWarpImplTest {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(Person.class);
        Class<?> name = beanWrapper.getPropertyType("name");

        System.out.println(name.getName());
    }
}
