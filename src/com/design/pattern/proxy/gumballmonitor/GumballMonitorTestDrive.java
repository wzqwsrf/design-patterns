package com.design.pattern.proxy.gumballmonitor;

import java.rmi.Naming;

/**
 * @author: wangzhenqing
 * @date: 2015-08-07 15:22:34
 * @description: 客户端测试类
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = { "rmi://localhost:8080/gumballmachine"};
//                "rmi://boulder.mightygumball.com/gumballmachine",
//                "rmi://seattle.mightygumball.com/gumballmachine" };

        GumballMonitor gumballMonitor[] = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                gumballMonitor[i] = new GumballMonitor(machine);
                System.out.println(gumballMonitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < gumballMonitor.length; i++) {
            gumballMonitor[i].report();
        }
    }
}
