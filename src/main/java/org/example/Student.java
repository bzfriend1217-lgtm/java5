package org.example;

public class Student {
    private final int id;
    private final String name;
    private int score;
    private PassStatus passStatus;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;


        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("IllegalArgument!");
        }

        if (this.score >= 60) {
            this.passStatus = PassStatus.PASSED; // 이게 맞나?
        } else {
            this.passStatus = PassStatus.FAILED; // 아니면 이게 맞나? 위에 import가 추가된게 맞나?
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
        return this.passStatus;
    }

    @Override
    public String toString() {
        return ( "id: " + this.id + " name: " + this.name + " score: " + this.score);
    }
}
