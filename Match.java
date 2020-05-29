/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1;

/**
 *
 * @author 23781271
 */
public class Match implements java.io.Serializable {
    private String matchTitle;
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private Referee matchReferee;


    Match(Team home, Team away,int homeGoals,int awayGoals,Referee ref){
        matchTitle = home.getName() + " vs " + away.getName();
        homeTeam = home;
        awayTeam = away;
        homeTeamGoals = homeGoals;
        awayTeamGoals = awayGoals;
        matchReferee = ref;
        if(homeTeamGoals == awayTeamGoals){
            homeTeam.addLeagueScore(1);
            awayTeam.addLeagueScore(1);
            homeTeam.addTie();
            awayTeam.addTie();
        }
        else if(homeTeamGoals > awayTeamGoals){
            homeTeam.addLeagueScore(3);
            homeTeam.addWin();
            awayTeam.addLoss();
        }
        else{
            awayTeam.addLeagueScore(3);
            awayTeam.addWin();
            homeTeam.addLoss();
        }
    }

    /**
     * Gets the Title of the Match
     * @return
     */
    public String getTitle(){
        return matchTitle;
    }

    /**
     * Gets the Team that played at Home
     * @return
     */
    public Team getHomeTeam(){
        return homeTeam;
    }

    /**
     * Gets the Team that played Away
     * @return
     */
    public Team getAwayTeam(){
        return awayTeam;
    }
    
    /**
     * Gets the Goals of the Home team
     * @return
     */
    public int getHomeGoals(){
        return homeTeamGoals;
    }

    /**
     * Gets the Goals of the Away Team
     * @return
     */
    public int getAwayGoals(){
        return awayTeamGoals;
    }

    /**
     * Gets the Match Referee
     * @return
     */
    public Referee getMatchReferee(){
        return matchReferee;
    }
}
