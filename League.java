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
public class League {

    private ArrayList<Team> leagueTeams;
    private ArrayList<Match> leagueMatches;
    private ArrayList<Player> leaguePlayers;
    private ArrayList<Player> playersWithNoTeam;
    private ArrayList<Referee> leagueReferees;
    private ArrayList<Coach> leagueCoaches;
    private ArrayList<Coach> availableCoaches;
    private ArrayList<Manager> leagueManagers;
    private ArrayList<Manager> availableManagers;

    League(ArrayList<Team> teams, ArrayList<Match> matches, ArrayList<Player> players, ArrayList<Player> availablePlayers,
            ArrayList<Coach> coaches, ArrayList<Coach> emptyCoaches, ArrayList<Manager> managers,
            ArrayList<Manager> emptyManagers, ArrayList<Referee> referees) {
        leagueTeams = teams;
        leagueMatches = matches;
        leaguePlayers = players;
        playersWithNoTeam = availablePlayers;
        leagueCoaches = coaches;
        availableCoaches = emptyCoaches;
        leagueManagers = managers;
        availableManagers = emptyManagers;
        leagueReferees = referees;
    }

    /**
     * Gets the leagueTeams ArrayList
     * @return
     */
    public ArrayList<Team> getTeams() {
        return leagueTeams;
    }

    /**
     * Gets a specific Team from the leagueTeams ArrayList, it will return the
     * element at the position of the int index that is fed as parameter
     *
     * @param index
     * @return
     */
    public Team getTeam(int index) {
        return leagueTeams.get(index);
    }

    /**
     * Gets a specific Referee from the leagueReferees ArrayList uses the int
     * index parameter to get the element position
     *
     * @param index
     * @return
     */
    public Referee getReferee(int index) {
        return leagueReferees.get(index);
    }

    /**
     * Gets the leaguePlayers ArrayList
     *
     * @return
     */
    public ArrayList<Player> getPlayers() {
        return leaguePlayers;
    }

    /**
     * Gets the playersWithNoTeam ArrayList
     *
     * @return
     */
    public ArrayList<Player> getPlayersWithNoTeam() {
        return playersWithNoTeam;
    }

    /**
     * Gets the leagueCoaches ArrayList
     *
     * @return
     */
    public ArrayList<Coach> getCoaches() {
        return leagueCoaches;
    }

    /**
     * Gets the availableCoaches ArrayList
     *
     * @return
     */
    public ArrayList<Coach> getAvailableCoaches() {
        return availableCoaches;
    }

    /**
     * Gets the leagueManagers ArrayList
     *
     * @return
     */
    public ArrayList<Manager> getManagers() {
        return leagueManagers;
    }

    /**
     * Gets the availableManagers ArrayList
     *
     * @return
     */
    public ArrayList<Manager> getAvailableManagers() {
        return availableManagers;
    }

    /**
     * Gets the leagueMatches ArrayList
     *
     * @return
     */
    public ArrayList<Match> getMatches() {
        return leagueMatches;
    }

    /**
     * Gets the leagueReferees ArrayList
     *
     * @return
     */
    public ArrayList<Referee> getReferees() {
        return leagueReferees;
    }

    /**
     * Gets a String[] to display the match titles, these are gotten from each
     * match on the leagueMatches Arraylist
     *
     * @return
     */
    public String[] getMatchTitles() {
        String[] matchTitles = new String[leagueMatches.size()];
        for (int i = 0; i < leagueMatches.size(); i++) {
            matchTitles[i] = leagueMatches.get(i).getTitle();
        }
        return matchTitles;
    }

    /**
     * Gets the TeamNames as a String[] to display it in lists
     *
     * @return
     */
    public String[] getTeamNames() {
        String[] teamNames = new String[leagueTeams.size()];
        for (int i = 0; i < leagueTeams.size(); i++) {
            teamNames[i] = leagueTeams.get(i).getName();
        }
        return teamNames;
    }

    /**
     * Gets the player names that have no team as a String[] from the
     * playersWithNoTeam ArrayList
     *
     * @return
     */
    public String[] getPlayerNamesWithNoTeam() {
        String[] playerNames = new String[playersWithNoTeam.size()];
        for (int i = 0; i < playersWithNoTeam.size(); i++) {
            playerNames[i] = playersWithNoTeam.get(i).getName();
        }
        return playerNames;
    }

    /**
     * Gets the availableCoaches names as a String[]
     *
     * @return
     */
    public String[] getAvailableCoachNames() {
        String[] coachNames = new String[availableCoaches.size()];
        for (int i = 0; i < availableCoaches.size(); i++) {
            coachNames[i] = availableCoaches.get(i).getName();
        }
        return coachNames;
    }

    /**
     * Gets the availableManager names as a String[]
     *
     * @return
     */
    public String[] getAvailableManagerNames() {
        String[] managerNames = new String[availableManagers.size()];
        for (int i = 0; i < availableManagers.size(); i++) {
            managerNames[i] = availableManagers.get(i).getName();
        }
        return managerNames;
    }

    /**
     * Gets the referee names as a String[]
     *
     * @return
     */
    public String[] getRefereeNames() {
        String[] refNames = new String[leagueReferees.size()];
        for (int i = 0; i < leagueReferees.size(); i++) {
            refNames[i] = leagueReferees.get(i).getName();
        }
        return refNames;
    }

    /**
     * Removes a player from the playersWithNoTeam ArrayList, the int index
     * parameter is used to get the element position
     *
     * @param index
     */
    public void removePlayerWithNoTeam(int index) {
        playersWithNoTeam.remove(index);
    }

    /**
     * Removes a coach from the availableCoaches ArrayList, the int index
     * parameter is used to get the element position
     *
     * @param index
     */
    public void removeAvailableCoach(int index) {
        availableCoaches.remove(index);
    }

    /**
     * Removes a manager from the availableManagers ArrayList, the int index
     * parameter is used to get the element position
     *
     * @param index
     */
    public void removeAvailableManager(int index) {
        availableManagers.remove(index);
    }

    /**
     * Adds a player to the playersWithNoTeam ArrayList
     *
     * @param newPlayer
     */
    public void addPlayerWithNoTeam(Player newPlayer) {
        playersWithNoTeam.add(newPlayer);
    }

    /**
     * Adds a Team to the leagueTeams ArrayList, only if a Team with the same
     * name does not exist. Returns true if add was successful, false otherwise
     *
     * @param team
     * @return
     */
    public boolean addTeam(Team team) {
        if (checkTeamExists(team.getName()) == false) {
            leagueTeams.add(team);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if any team in the leagueTeams ArrayList already have the same
     * name used in the addTeam method, takes the String Team name from the Team
     * that is to be checked as parameter
     *
     * @param teamName
     * @return
     */
    public boolean checkTeamExists(String teamName) {
        boolean teamExists = false;
        for (int i = 0; i < leagueTeams.size(); i++) {
            if (leagueTeams.get(i).getName().equals(teamName)) {
                teamExists = true;
            }
        }
        return teamExists;
    }

    /**
     * Removes a Team from the leagueTeams ArrayList, element position is gotten
     * from the int index parameter. Coach, manager and players from the team
     * that is to be deleted will be stored in the availableCoaches,
     * availableManagers and playersWithNoTeam
     *
     * @param index
     */
    public void deleteTeam(int index) {
        addAvailableCoach(leagueTeams.get(index).getCoach());
        addAvailableManager(leagueTeams.get(index).getManager());
        ArrayList<Player> players = leagueTeams.get(index).getPlayers();
        for (int i = 0; i < players.size(); i++) {
            addPlayerWithNoTeam(players.get(i));
        }
        leagueTeams.remove(index);
    }

    /**
     * Removes a Coach from both leagueCoaches and availableCoaches ArrayLists
     *
     * @param index
     */
    public void deleteCoach(int index) {
        for (int i = 0; i < leagueCoaches.size(); i++) {
            if (leagueCoaches.get(i).getName().equals(availableCoaches.get(index).getName())) {
                leagueCoaches.remove(i);
            }
        }
        availableCoaches.remove(index);
    }

    /**
     * Removes a Manager from both leagueManagers and availableManagers
     * ArrayLists
     *
     * @param index
     */
    public void deleteManager(int index) {
        for (int i = 0; i < leagueManagers.size(); i++) {
            if (leagueManagers.get(i).getName().equals(availableManagers.get(index).getName())) {
                leagueManagers.remove(i);
            }
        }
        availableManagers.remove(index);
    }

    /**
     * Removes a Referee from the leagueReferees ArrayList
     *
     * @param index
     */
    public void deleteReferee(int index) {
        leagueReferees.remove(index);
    }

    /**
     *
     * @param index
     */
    public void deleteMatch(int index) {
        leagueMatches.remove(index);
    }

    /**
     * Runs the checkPersonExists method, if it returns false the Player is
     * added to the leaguePlayers ArrayList Method overloading is used depending
     * on the entity to be added
     *
     * @param player
     * @return
     */
    public boolean addPerson(Player player) {
        if (checkPersonExists(player) == false) {
            leaguePlayers.add(player);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the player exists by comparing its name and number with the
     * names and numbers of the Players in the leaguePlayers ArrayList Returns
     * false if player considered not to exist, true if it exists stopping the
     * player from being added
     *
     * @param player
     * @return
     */
    public boolean checkPersonExists(Player player) {
        boolean playerExists = false;
        for (int i = 0; i < leaguePlayers.size(); i++) {
            if (leaguePlayers.get(i).getName().equals(player.getName()) && leaguePlayers.get(i).getNumber() == player.getNumber()) {
                playerExists = true;
            }
        }
        return playerExists;
    }

    /**
     * Runs the checkPersonExists method, if it returns false the Coach is added
     * to the leagueCoaches ArrayList Method overloading is used depending on
     * the entity to be added
     *
     * @param coach
     * @return
     */
    public boolean addPerson(Coach coach) {
        if (checkPersonExists(coach) == false) {
            leagueCoaches.add(coach);
            addAvailableCoach(coach);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the Coach exists by comparing its name with the names Coaches
     * in the leagueCoaches ArrayList Returns false if Coach considered not to
     * exist, true if it exists stopping the Coach from being added
     *
     * @param coach
     * @return
     */
    public boolean checkPersonExists(Coach coach) {
        boolean coachExists = false;
        for (int i = 0; i < leagueCoaches.size(); i++) {
            if (leagueCoaches.get(i).getName().equals(coach.getName())) {
                coachExists = true;
            }
        }
        return coachExists;
    }

    /**
     * Runs the checkPersonExists method, if it returns false the Manager is
     * added to the leagueManagers ArrayList Method overloading is used
     * depending on the entity to be added
     *
     * @param manager
     * @return
     */
    public boolean addPerson(Manager manager) {
        if (checkPersonExists(manager) == false) {
            leagueManagers.add(manager);
            addAvailableManager(manager);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the Manager exists by comparing its name with the names
     * Managers in the leagueManagers ArrayList Returns false if Manager
     * considered not to exist, true if it exists stopping the Manager from
     * being added
     *
     * @param manager
     * @return
     */
    public boolean checkPersonExists(Manager manager) {
        boolean managerExists = false;
        for (int i = 0; i < leagueManagers.size(); i++) {
            if (leagueManagers.get(i).getName().equals(manager.getName())) {
                managerExists = true;
            }
        }
        return managerExists;
    }

    /**
     * Runs the checkPersonExists method, if it returns false the Referee is
     * added to the leagueReferees ArrayList Method overloading is used
     * depending on the entity to be added
     *
     * @param ref
     * @return
     */
    public boolean addPerson(Referee ref) {
        if (checkPersonExists(ref) == false) {
            leagueReferees.add(ref);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the Referee exists by comparing its name with the names
     * Referees in the leagueReferees ArrayList Returns false if Referee
     * considered not to exist, true if it exists stopping the Referee from
     * being added
     *
     * @param ref
     * @return
     */
    public boolean checkPersonExists(Referee ref) {
        boolean refExists = false;
        for (int i = 0; i < leagueReferees.size(); i++) {
            if (leagueReferees.get(i).getName().equals(ref.getName())) {
                refExists = true;
            }
        }
        return refExists;
    }

    /**
     * Adds a Coach Object to the availableCoaches ArrayList
     * @param coach
     */
    public void addAvailableCoach(Coach coach) {
        availableCoaches.add(coach);
    }

    /**
     * Adds a manager Object to the availableManagers ArrayList
     * @param manager
     */
    public void addAvailableManager(Manager manager) {
        availableManagers.add(manager);
    }

    /**
     * Adds a specific player to a team, the teamIndex parameter serves to
     * indicate which Team in the ArrayList to add the player to, will return
     * true or false depending on what the addPlayer method in the Team Class
     * returns
     *
     * @param player
     * @param teamIndex
     * @return
     */
    public boolean addPlayerToTeam(Player player, int teamIndex) {
        return leagueTeams.get(teamIndex).addPlayer(player);
    }

    /**
     * Adds the match to the leagueMatches ArrayList, however it checks first if
     * said teams have played with each other in these circumstances only then
     * it will allow the match to be stored Returns true if it was added, false
     * if it was not
     *
     * @param match
     * @return
     */
    public boolean createMatch(Match match) { //
        boolean allowMatch = true;
        int i = 0;
        while (i < leagueMatches.size() && allowMatch == true) {
            if (leagueMatches.get(i).getTitle().equals(match.getTitle())) {
                allowMatch = false;
            }
            i++;
        }
        if (allowMatch == true) {
            leagueMatches.add(match);
        }
        return allowMatch;
    }

    /**
     * Resets the scores, wins, losses and ties variables of each Team
     */
    public void resetScores() {
        for (int i = 0; i < leagueTeams.size(); i++) {
            leagueTeams.get(i).resetLeagueScore();
            leagueTeams.get(i).resetWins();
            leagueTeams.get(i).resetLosses();
            leagueTeams.get(i).resetTies();
        }
    }

    /**
     * Gets the scores of each team as a String[], each element will contain
     * score, wins, ties and losses of each team. Ideally needs to be improved
     * in order to sort them by score in descending order
     *
     * @return
     */
    public String[] getScores() {
        String[] scores = new String[leagueTeams.size()];
        for (int i = 0; i < leagueTeams.size(); i++) {
            Team tempTeam = leagueTeams.get(i);
            scores[i] = "Score: " + tempTeam.getLeagueScore() + "   Wins: "
                    + tempTeam.getWins() + "   Ties: " + tempTeam.getTies() + "   Losses: " + tempTeam.getLosses();
        }
        return scores;
    }

}
