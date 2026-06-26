package org.example;

public class Student {
    private final int id;
    private final String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;

        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("IllegalArgument!");
        }
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("IllegalArgument!");
        }
    }

    public PassStatus getPassStatus() {
        if (score >= 60) {
            return PassStatus.PASSED;
        } else {
            return PassStatus.FAILED;
        }
    }

    @Override
    public String toString() {
        return ( "id: " + this.id + " name: " + this.name + " score: " + this.score);
    }
}
