package com.epam.training.main.task3;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    private final int amountNumbers;
    private final ArrayList<Integer> arrayRandomNumbers = new ArrayList<Integer>();

    public RandomNumber(int amountNumbers) {
        this.amountNumbers = amountNumbers;
        setArrayRandomNumbers(amountNumbers);
    }

    public void setArrayRandomNumbers(int amountNumbers) {
        Random random = new Random();
        this.arrayRandomNumbers.clear();
        for (int i = 0; i < amountNumbers; i++) {
            this.arrayRandomNumbers.add(random.nextInt(100));
        }
    }

    public ArrayList<Integer> getArrayRandomNumbers() {
        return arrayRandomNumbers;
    }
}
