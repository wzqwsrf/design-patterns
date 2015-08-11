package com.design.pattern.proxy.gumballmonitor;

import java.rmi.RemoteException;

/**
 * @author: wangzhenqing
 * @date: 2015-08-07 15:19:26
 * @description: 客户端
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineRemote.getLocation());
            System.out.println("Current inventory:" + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current state:" + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
