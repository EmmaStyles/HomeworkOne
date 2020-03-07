package com.example.homeworkone;

public class Roll {
    private int dice1;
    private int dice2;
    private int sum;

    public Roll() {
    }

    public Roll(int dice1, int dice2, int sum) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.sum = sum;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
