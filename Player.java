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
public class Player extends Person {

    private String role;
    private int shirtNumber;

    Player(String Name, int Age, String Role, int number) {
        super(Name, Age);
        role = Role;
        shirtNumber = number;
    }

    /**
     * Gets the role of the Player
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role of the Player
     * @param Role
     */
    public void setRole(String Role) {
        role = Role;
    }

    /**
     * Gets the number of the Player
     * @return
     */
    public int getNumber() {
        return shirtNumber;
    }

    /**
     * Sets the number of the Player
     * @param number
     */
    public void setNumber(int number) {
        shirtNumber = number;
    }
}
