package com.company;

public abstract class Team implements Comparable<Team> {
    protected String name;
    protected int won;
    protected int tied;
    protected int lost;
    protected int tableScore;

    protected Team(String name) {
        this.name = name;
        this.won = 0;
        this.tied = 0;
        this.lost = 0;
        this.tableScore = 0;
    }

    protected void setWon(int won) {
        this.won = won;
    }

    protected void setTied(int tied) {
        this.tied = tied;
    }

    protected void setLost(int lost) {
        this.lost = lost;
    }

    protected String getName() {
        return name;
    }

    protected int getWon() {
        return won;
    }

    protected int getTied() {
        return tied;
    }

    protected int getLost() {
        return lost;
    }

    protected int getTableScore() {
        return tableScore;
    }


    protected int ranking() {
        return tableScore = won * 2 + tied;
    }



    @Override
    public int compareTo(Team team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }


}
