package com.example.demo.design;

/**
 * @author jiange
 * @date 2020/11/26 15:31
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
