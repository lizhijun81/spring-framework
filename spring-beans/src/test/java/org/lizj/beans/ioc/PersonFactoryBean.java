package org.lizj.beans.ioc;

public class PersonFactoryBean  {

    public Person getPerson() {
        Person person = new Person();
        person.setName("yyy");
        return person;
    }
}
