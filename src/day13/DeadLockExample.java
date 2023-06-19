package day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    String str1 = "Java";
    String str2 = "UNIX";
    private static Lock lock = new ReentrantLock();
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            int count=5;
            while(count>0){
                //lock.lock();
                synchronized(str2){

                    System.out.println(str2 + str1);
                }
                synchronized(str1){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str2 + str1);
                }
                count--;
            }
        }
    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            int count=5;
            while(count>0){
                //lock.lock();
                synchronized(str2){

                    System.out.println(str2 + str1);
                }
                synchronized(str1){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str2 + str1);
                }
                count--;
            }
          //  lock.unlock();
        }
    };

    public static void main(String a[]){
        DeadLockExample mdl = new DeadLockExample();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}