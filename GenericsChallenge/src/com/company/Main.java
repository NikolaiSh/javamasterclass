package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballTeam manchesterUnited = new FootballTeam("Manchester United");
        FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam dinamoKiev = new FootballTeam("Dinamo Kiev");

        LeagueTable<FootballTeam> footballLeague = new LeagueTable<>();
        footballLeague.addTeam(manchesterUnited);
        footballLeague.addTeam(liverpool);
        footballLeague.addTeam(dinamoKiev);

        footballLeague.printLeagueTable();
        footballLeague.matchResult(dinamoKiev, manchesterUnited, 5, 4);
        footballLeague.matchResult(liverpool,manchesterUnited,3,4);
        footballLeague.matchResult(liverpool,manchesterUnited,2,2);
        footballLeague.matchResult(liverpool,dinamoKiev,2,1);
        footballLeague.matchResult(liverpool,dinamoKiev,2,0);

        System.out.println();
        footballLeague.printLeagueTable();


    }
}
