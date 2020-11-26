package com.example.demo.locks;

/**
 * @author jiange
 * @date 2020/11/24 15:02
 */
public class VolatileTest {
    public static void main(String[] args) {
        final CountDemo counter = new CountDemo();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.inc();
                }
            }).start();
        }
        System.out.println(counter.toString());
    }
}
