package dev.nghia3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        App app = new App("Sky Sports");
        League<Team<FootballPlayer>> epl = new League<>("English Premier League");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal", 32, 23, 6, 3, 77, 34, 43, 75);
        Team<FootballPlayer> manCity = new Team<>("Manchester City", 30, 22, 4, 4, 78, 28, 50, 70);
        Team<FootballPlayer> newcastle = new Team<>("Newcastle", 31, 16, 11, 4, 54, 25, 29, 59);
        Team<FootballPlayer> manUnited = new Team<>("Manchester United", 30, 18, 5, 7, 46, 37, 9, 59);
        Team<FootballPlayer> tottenham = new Team<>("Tottenham", 32, 16, 5, 11, 58, 51, 7, 53);
        Team<FootballPlayer> astonVilla = new Team<>("Aston Villa", 32, 15, 6, 11, 45, 41, 4, 51);
        Team<FootballPlayer> liverpool = new Team<>("Liverpool", 31, 14, 8, 9, 59, 38, 21, 50);

        epl.addTeam(arsenal);
        epl.addTeam(manCity);
        epl.addTeam(newcastle);
        epl.addTeam(manUnited);
        epl.addTeam(tottenham);
        epl.addTeam(astonVilla);
        epl.addTeam(liverpool);

        System.out.println("=".repeat(145));
        System.out.printf("| %-10s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s\n", "NO.", "CLUB", "MP", "W", "D", "L", "GF", "GA", "GD", "PTS");
        System.out.println("=".repeat(145));

        ArrayList<Team<FootballPlayer>> teams = epl.getTeams();
        int firstNumber = 1;
        for (Team<FootballPlayer> team : teams) {
            System.out.printf("| %-10s | %-25s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s\n", firstNumber++, team.getName(), team.getMatchPlayed(), team.getWin(), team.getDraw(), team.getLoss(), team.getGoalsFor(), team.getGoalsAgainst(), team.getGoalDifference(), team.getPoints());
            System.out.println("-".repeat(145));
        }
    }
}
