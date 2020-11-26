package com.example.demo.design;

/**
 * @author jiange
 * @date 2020/11/26 15:34
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
