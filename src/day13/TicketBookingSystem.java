package day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {
    private static int totalTickets = 10;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread[] threads = new Thread[5]; // Number of threads

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new TicketBookingTask(), "Thread " + (i + 1));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All tickets have been booked.");
    }

    static class TicketBookingTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    if (totalTickets > 0) {
                        // Simulate some processing time for booking
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println(Thread.currentThread().getName() + " booked ticket " + totalTickets);
                        totalTickets--;
                        break;
                    } else {
                        break; // No more tickets available
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
