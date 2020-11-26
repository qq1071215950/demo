package com.example.demo.design;

/**
 * @author jiange
 * @date 2020/11/26 15:32
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
