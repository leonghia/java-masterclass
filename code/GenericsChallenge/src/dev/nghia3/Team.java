package dev.nghia3;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    private int matchPlayed;
    private int win;
    private int draw;
    private int loss;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int points;
    private ArrayList<T> players;

    public Team(String name, int matchPlayed, int win, int draw, int loss, int goalsFor, int goalsAgainst, int goalDifference, int points) {
        this.name = name;
        this.matchPlayed = matchPlayed;
        this.win = win;
        this.draw = draw;
        this.loss = loss;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
        this.points = points;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public int getDraw() {
        return draw;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<T> getPlayers() {
        return players;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public boolean addPlayer(T player) {
        T result = findPlayer(player.getName(), player.getDob());
        if (result == null) {
            players.add(player);
            return true;
        }
        throw new IllegalArgumentException("Player already exists");
    }

    public boolean deletePlayer(String name, String dob) {
        T result = findPlayer(name, dob);
        if (result == null) {
            throw new IllegalArgumentException("Player does not exist");
        }
        players.remove(result);
        return true;
    }

    public T findPlayer(String name, String dob) {
        for (T player : players) {
            if (player.getName().equals(name) && player.getDob().equals(dob)) {
                return player;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Team[name = %s]", name);
    }
}
