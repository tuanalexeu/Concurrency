package com.company;

public class BadThreads {

    static String message;

    public static synchronized void setMessage(String message) {
        BadThreads.message = message;
    }

    private static class CorrectorThread extends Thread {
        public void run() {
            try {
                sleep(1000); 
            } catch (InterruptedException ignored) {}
            // Key statement 1:
            setMessage("Mares do eat oats.");
        }
    }

    public static void main(String args[])
        throws InterruptedException {

        (new CorrectorThread()).start();

        setMessage("Mares do not eat oats.");
        Thread.sleep(2000);
        // Key statement 2:
        System.out.println(message);
    }
}