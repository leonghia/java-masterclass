package dev.nghia3;

import java.util.ArrayList;

public class App {

    private String name;
    private ArrayList<League> leagues;

    public App(String name) {
        this.name = name;
        leagues = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public boolean addLeague(League league) {
        League result = findLeague(league.getName());
        if (result == null) {
            leagues.add(league);
            return true;
        }
        throw new IllegalArgumentException("League already exists");
    }

    public boolean deleteLeague(String name) {
        League result = findLeague(name);
        if (result == null) {
            throw new IllegalArgumentException("League does not exist");
        }
        leagues.remove(result);
        return true;
    }

    public League findLeague(String name) {
        for (League league : leagues) {
            if (league.getName().equals(name)) {
                return league;
            }
        }
        return null;
    }
}
