package com.example.demo.locks;

/**
 * @author jiange
 * @date 2020/11/24 15:00
 */
public class CountDemo {
    private volatile int count = 0;

    public void inc() {
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    @Override
    public String toString() {
        return "[count=" + count + "]";
    }
}
