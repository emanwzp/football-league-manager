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
public class Team implements java.io.Serializable {

    private String name;
    private Coach coach;
    private Manager manager;
    private ArrayList<Player> players;
    private int leagueScore;
    private int wins;
    private int losses;
    private int ties;
    private Player captain;

    Team(String Name, Coach Coach, Manager Manager) {
        name = Name;
        coach = Coach;
        manager = Manager;
        players = new ArrayList<>();
    }

    /**
     * Returns all the players in the team as an ArrayList
     * @return 
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Returns all the player names from the ArrayList as a String[], for displaying purposes
     * @return 
     */
    public String[] getPlayerNames() {
        String[] playerNames = new String[players.size()];
        for (int i = 0; i < players.size(); i++) {
            playerNames[i] = players.get(i).getName();
        }
        return playerNames;
    }

    /**
     * Sets the name of the Team
     * @param Name
     */
    public void setName(String Name) {
        name = Name;
    }

    /**
     * Gets the name of the Team
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Coach of the Team
     * @return
     */
    public Coach getCoach() {
        return coach;
    }

    /**
     *  Sets the Coach of the Team
     * @param Coach
     */
    public void setCoach(Coach Coach) {
        coach = Coach;
    }

    /**
     *  Gets the manager of the Team
     * @return
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Sets the manager of the Team
     * @param Manager
     */
    public void setManager(Manager Manager) {
        manager = Manager;
    }

    /**
     *  Increments the wins variable by one, for score purposes
     */
    public void addWin() {
        wins++;
    }

    /**
     * Gets the wins of the Team
     * @return
     */
    public int getWins() {
        return wins;
    }

    /**
     * Increments the losses variable by one, for score purposes
     */
    public void addLoss() {
        losses++;
    }

    /**
     * Gets the losses of the Team
     * @return
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Increments the ties variable by one, for score purposes
     */
    public void addTie() {
        ties++;
    }

    /**
     * Gets the ties of the Team
     * @return
     */
    public int getTies() {
        return ties;
    }

    /**
     * Adds a specific amount of score the team, 
     * depending if they won or tied against the other team
     * @param score
     */
    public void addLeagueScore(int score) {
        leagueScore = leagueScore + score;
    }

    /**
     * Gets the leagueScore of the Team
     * @return
     */
    public int getLeagueScore() {
        return leagueScore;
    }

    /**
     * Sets the leagueScore to 0
     */
    public void resetLeagueScore() {
        leagueScore = 0;
    }

    /**
     * Sets the wins to 0
     */
    public void resetWins() {
        wins = 0;
    }

    /**
     * Sets the losses to 0
     */
    public void resetLosses() {
        losses = 0;
    }

    /**
     * Sets the ties to 0
     */
    public void resetTies() {
        ties = 0;
    }

    /**
     * removes a player from the players ArrayList by taking an int 
     * index as parameter that will be used to get the ArrayList index
     * @param index
     */
    public void removePlayer(int index) {
        players.remove(index);
    }

    /**
     * Adds a player to the team players ArrayList, 
     * will only allow if the size of ArrayList is lower than 13 
     * returns true if the add was successful, false otherwise
     * @param newPlayer
     * @return
     */
    public boolean addPlayer(Player newPlayer) {
        boolean add = true;
        if (players.size() == 13) {
            //error team is full, needs to remove a member first
            add = false;
        } else {
            players.add(newPlayer);
        }
        return add;
    }

    /**
     * Gets the Captain from the Team, might return null if no 
     * Captain has been assigned
     * @return
     */
    public Player getCaptain() {
        if (captain != null) {
            return captain;
        } else {
            return null;
        }

    }

    /**
     * Sets the captain of the Team
     * @param index
     */
    public void setCaptain(int index) {
        captain = players.get(index);
    }

    /**
     * Checks if there are enough players to create play a match
     * @return
     */
    public boolean checkEnoughPlayers() {
        if (players.size() < 11) {
            return false;
        } else {
            return true;
        }
    }
}
