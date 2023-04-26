package dev.nghia3;

public abstract class Player {

    private String name;
    private int number;
    private String dob;
    private String nationality;

    public Player(String name, int number, String dob, String nationality) {
        this.name = name;
        this.number = number;
        this.dob = dob;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getDob() {
        return dob;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public abstract String toString();
}

class FootballPlayer extends Player {

    public FootballPlayer(String name, int number, String dob, String nationality) {
        super(name, number, dob, nationality);
    }

    @Override
    public String toString() {
        return String.format("Football player[name = %s, number = %d, dob = %s, nationality = %s]", getName(), getNumber(), getDob(), getNationality());
    }
}

class BasketballPlayer extends Player {

    public BasketballPlayer(String name, int number, String dob, String nationality) {
        super(name, number, dob, nationality);
    }

    @Override
    public String toString() {
        return String.format("Basketball player[name = %s, number = %d, dob = %s, nationality = %s]", getName(), getNumber(), getDob(), getNationality());
    }
}
