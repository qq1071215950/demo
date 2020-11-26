package com.example.demo.locks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jiange
 * @date 2020/11/24 15:38
 */
public class ThreadCommunication {
    private static int num;
    private static Semaphore semaphore = new Semaphore(0);
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    num = 1;
                    semaphore.release(2);
                }catch (InterruptedException e) {


                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("获取通信证开始"+ Thread.currentThread().getName());
                    semaphore.acquire();
                    System.out.println("获取通信证结束"+ Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    System.out.println("获取通信证失败"+ Thread.currentThread().getName());
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"获取到 num 的值为："+num);
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("获取通信证开始"+ Thread.currentThread().getName());
                    semaphore.acquire();
                    System.out.println("获取通信证结束"+ Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    System.out.println("获取通信证失败"+ Thread.currentThread().getName());
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"获取到 num 的值为："+num);
            }
        });
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++){
            countDownLatch.countDown();
        }
        System.out.println(countDownLatch.getCount());
        try {
            countDownLatch.wait();
            System.out.println("ned");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
