/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1;

import java.util.ArrayList;

/**
 *
 * @author 23781271
 */
public class Person implements java.io.Serializable {

    private String name;
    private int age;

    Person(String Name, int Age) {
        name = Name;
        age = Age;
    }

    /**
     * Gets the name of the Person
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Person
     * @param Name
     */
    public void setName(String Name) {
        name = Name;
    }

    /**
     * Gets the Age of the Person
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the Age of the Person
     * @param Age
     */
    public void setAge(int Age) {
        age = Age;
    }
}
