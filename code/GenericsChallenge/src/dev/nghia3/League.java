package dev.nghia3;

import java.util.ArrayList;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public boolean addTeam(T team) {
        T result = findTeam(team.getName());
        if (result == null) {
            teams.add(team);
            return true;
        }
        throw new IllegalArgumentException("Team already exists");
    }

    public boolean deleteTeam(String name) {
        T result = findTeam(name);
        if (result == null) {
            throw new IllegalArgumentException("Team does not exist");
        }
        teams.remove(result);
        return true;
    }

    public T findTeam(String name) {
        for (T team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("League[name = %s]", name);
    }
}
