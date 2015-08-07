package proxy.gumballmonitor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author: wangzhenqing
 * @date: 2015-08-06 11:36:25
 * @description: 测试类
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine = new GumballMachine("abc",5);
            LocateRegistry.createRegistry(8080);
            Naming.bind("//localhost:8080/gumballmachine", gumballMachine);
            System.out.println("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
