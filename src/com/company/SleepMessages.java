package com.company;

public class SleepMessages {
    public static void main(String[] args) {
        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String s : importantInfo) {
            //Pause for 4 seconds
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                return;
            }
            //Print a message
            System.out.println(s);
        }
    }
}