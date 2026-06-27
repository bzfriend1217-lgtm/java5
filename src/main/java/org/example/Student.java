package org.example;

public class Student {
    private final int id;
    private final String name;
    private int score;
    private PassStatus passStatus;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;

        if (score >= 60 && score <= 100) {
            this.score = score;
            this.passStatus = PassStatus.PASSED;
        } else if (score >= 0 && score <= 60) {
            this.score = score;
            this.passStatus = PassStatus.FAILED;
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
        if (score >= 60 && score <= 100) {
            this.score = score;
            this.passStatus = PassStatus.PASSED;
        } else if (score >= 0 && score <= 60) {
            this.score = score;
            this.passStatus = PassStatus.FAILED;
        } else {
            throw new IllegalArgumentException("IllegalArgument!");
        }
    }

    public PassStatus getPassStatus() {
        return this.passStatus;
    }

    @Override
    public String toString() {
        return ( "id: " + this.id + " name: " + this.name + " score: " + this.score);
    }
}
