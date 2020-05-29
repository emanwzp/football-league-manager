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
public class Launcher {

    /**
     * @param args the command line arguments
     */
    static DataHandler dataHandler = new DataHandler();
    static League league;
    
    static private String teamsPath = "files/teams.dat";
    static private String matchesPath = "files/teams.datmatches.dat";
    static private String playersPath = "files/teams.datplayers.dat";
    static private String availablePlayersPath = "files/teams.datavailableplayers.dat";
    static private String coachesPath = "files/teams.datcoaches.dat";
    static private String availableCoachesPath = "files/teams.datavailablecoaches.dat";
    static private String managersPath = "files/teams.datmanagers.dat";
    static private String availableManagersPath = "files/teams.datavailablemanagers.dat";
    static private String refereesPath = "files/teams.datreferees.dat";
    
    /**
     * Creates a new league instance loading the data from the dataHandler Class
     * and creates a new MainMenu instance which is the GUI
     * @param args
     */
    public static void main(String[] args) {
        league = new League(dataHandler.loadTeams(teamsPath),dataHandler.loadMatches(matchesPath),
                dataHandler.loadPlayers(playersPath),dataHandler.loadPlayers(availablePlayersPath),dataHandler.loadCoaches(coachesPath),
                dataHandler.loadCoaches(availableCoachesPath),dataHandler.loadManagers(managersPath),dataHandler.loadManagers(availableManagersPath),
                dataHandler.loadReferees(refereesPath));
        new MainMenu().setVisible(true);
    }

    /**
     * Saves all the ArrayLists in the 
     * league Object using the dataHandler methods
     */
    public static void save(){
        dataHandler.saveMatches(league.getMatches(),matchesPath);
        dataHandler.saveTeams(league.getTeams(),teamsPath);
        
        dataHandler.savePlayers(league.getPlayersWithNoTeam(),availablePlayersPath);
        dataHandler.saveCoaches(league.getCoaches(), coachesPath);
        dataHandler.saveCoaches(league.getAvailableCoaches(), availableCoachesPath);
        dataHandler.saveManagers(league.getManagers(),managersPath);
        dataHandler.saveManagers(league.getAvailableManagers(), availableManagersPath);
        dataHandler.saveReferees(league.getReferees(),refereesPath);
    }
    
}
