package com.design.pattern.proxy.gumballmonitor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author: wangzhenqing
 * @date: 2015-08-06 18:03:14
 * @description:
 */
public interface GumballMachineRemote extends Remote{
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
