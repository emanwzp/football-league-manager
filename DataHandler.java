/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author 23781271
 */
public class DataHandler {
    
    /**
     * Saves the players from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param players
     * @param path
     */
    public void savePlayers(ArrayList<Player> players, String path){
        try {
            ObjectOutputStream playersFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <players.size(); i++) {
                playersFile.writeObject(players.get(i));
            }
            playersFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Players into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Player> loadPlayers(String path){
        ArrayList<Player> players = new ArrayList<>();
        ObjectInputStream playersFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            playersFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Player ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (players.add((Player) playersFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close the ObjectInputStream after all objects have been read
            try {
                if (playersFile != null) {
                    playersFile.close();
                    System.out.println("File has been closed");
                }
            } catch (IOException e) {
                System.err.println("There was an error closing the file");
            }
        }
        return players;
    }

    /**
     * Saves the Teams from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param teams
     * @param path
     */
    public void saveTeams(ArrayList<Team> teams,String path){
        try {
            ObjectOutputStream teamsFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <teams.size(); i++) {
                teamsFile.writeObject(teams.get(i));
            }
            teamsFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Teams into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Team> loadTeams(String path){
        ArrayList<Team> teams = new ArrayList<>();
        ObjectInputStream teamsFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            teamsFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Team ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (teams.add((Team) teamsFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close ObjectInputStream after all objects have been read
            try {
                if (teamsFile != null) {
                    teamsFile.close();
                    System.out.println("File has been closed");
                }
            } catch (IOException e) {
                System.err.println("There was an error closing the file");
            }
        }
        return teams;
    }

    /**
     * Saves the Coaches from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param coaches
     * @param path
     */
    public void saveCoaches(ArrayList<Coach> coaches,String path){
        try {
            ObjectOutputStream coachesFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <coaches.size(); i++) {
                coachesFile.writeObject(coaches.get(i));
            }
            coachesFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Coaches into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Coach> loadCoaches(String path){
        ArrayList<Coach> coaches = new ArrayList<>();
        ObjectInputStream coachesFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            coachesFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Coach ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (coaches.add((Coach) coachesFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close ObjectInputStream after all objects have been read
            try {
                if (coachesFile != null) {
                    coachesFile.close();
                }
            } catch (IOException e) {
                
            }
        }
        return coaches;
    }

    /**
     * Saves the Managers from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param managers
     * @param path
     */
    public void saveManagers(ArrayList<Manager> managers,String path){
        try {
            ObjectOutputStream managersFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <managers.size(); i++) {
                managersFile.writeObject(managers.get(i));
            }
            managersFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Managers into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Manager> loadManagers(String path){
        ArrayList<Manager> managers = new ArrayList<>();
        ObjectInputStream managersFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            managersFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Manager ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (managers.add((Manager) managersFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close ObjectInputStream after all objects have been read
            try {
                if (managersFile != null) {
                    managersFile.close();
                    System.out.println("File has been closed");
                }
            } catch (IOException e) {
                System.err.println("There was an error closing the file");
            }
        }
        return managers;
    }

    /**
     * Saves the Referees from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param referees
     * @param path
     */
    public void saveReferees(ArrayList<Referee> referees,String path){
        try {
            ObjectOutputStream refereesFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <referees.size(); i++) {
                refereesFile.writeObject(referees.get(i));
            }
            refereesFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Referees into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Referee> loadReferees(String path){
        ArrayList<Referee> referees = new ArrayList<>();
        ObjectInputStream refereesFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            refereesFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Referee ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (referees.add((Referee) refereesFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close both ObjectStream after all objects have been read
            try {
                if (refereesFile != null) {
                    refereesFile.close();
                    System.out.println("File has been closed");
                }
            } catch (IOException e) {
                System.err.println("There was an error closing the file");
            }
        }
        return referees;
    }

    /**
     * Saves the Matches from the ArrayList provided as parameter
     * into a file which path is specified as parameter too
     * @param matches
     * @param path
     */
    public void saveMatches(ArrayList<Match> matches, String path){
        try {
            ObjectOutputStream matchesFile = new ObjectOutputStream(new FileOutputStream(path));
            for (int i = 0; i <matches.size(); i++) {
                matchesFile.writeObject(matches.get(i));
            }
            matchesFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the Matches into an ArrayList from the path specified as parameter
     * and returns it
     * @param path
     * @return
     */
    public ArrayList<Match> loadMatches(String path){
        ArrayList<Match> matches = new ArrayList<>();
        ObjectInputStream matchesFile = null;    //declaring it outside so file can be closed in the finally statement
        try {
            matchesFile = new ObjectInputStream(new FileInputStream(path));
            //Tries to add to the Match ArrayList and it will keep returning true when added, once it fails, loop breaks and EOFException is caught
            while (matches.add((Match) matchesFile.readObject()));

        } catch (Exception e) {
            if (e instanceof java.io.EOFException) { //this will always be thrown when there are no more objects to be added to the array
                System.out.println("All objects have been added");
            } else {
                e.printStackTrace();
            }
        } finally {  //Do not forget to close ObjectInputStream after all objects have been read
            try {
                if (matchesFile != null) {
                    matchesFile.close();
                    System.out.println("File has been closed");
                }
            } catch (IOException e) {
                System.err.println("There was an error closing the file");
            }
        }
        return matches;
    }

}

