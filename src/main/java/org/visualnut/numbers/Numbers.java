package org.visualnut.numbers;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author geraldobarrosjr
 */
public class Numbers {

    Logger logger = Logger.getLogger(Numbers.class.getName());
    private ArrayList<Integer> numbers;
    public Numbers(int value) {
        numbers= new ArrayList<>();
        for (int i = 1; i <= value; i++) {
            numbers.add(i);
        }
    }
    public void print() {
        logger.info("Printing numbers, size: %d".formatted(numbers.size()));

        for (int number : numbers) {
            if (number % 15 == 0) {
                System.out.println("Visual Nuts");
            } else if (number % 3 == 0) {
                System.out.println("Visual");
            } else if (number % 5 == 0) {
                System.out.println("Nuts");
            } else {
                System.out.println("%d".formatted(number));
            }
        }


    }


}
