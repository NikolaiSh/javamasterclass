package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable<T extends Team> {
    private ArrayList<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if(isFound(team)) {
            System.out.println("Team " + team.getName() + " is already on the League Table");
            return false;
        }

        teams.add(team);
        System.out.println("Team " + team.getName() + " added to the League Table");
        return true;
    }

    public void printLeagueTable() {
        if(!teams.isEmpty()) {
            int count = 0;
            for(T t : teams) {
                System.out.println(count + ". " + t.getName() + ", scores: " + t.getTableScore());
                count++;
            }
        }

    }

    private void sortTeams(){
        Collections.sort(teams);
    }

    private boolean isFound(T team) {
        if(teams.contains(team)) {
            return true;
        }
        return false;
    }

    public void matchResult(T team1, T team2, int team1Score, int team2Score){
        if(team1Score > team2Score) {
            team1.setWon(team1.getWon() + 1);
        } else if (team1Score == team2Score) {
            team1.setTied(team1.getTied() + 1);
            team2.setTied(team2.getTied() + 1);
        } else if (team1Score < team2Score) {
            team2.setWon(team2.getWon() + 1);
        }
        team1.ranking();
        team2.ranking();
        sortTeams();
    }


}
