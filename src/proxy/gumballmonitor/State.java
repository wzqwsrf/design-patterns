package proxy.gumballmonitor;

import java.io.Serializable;

/**
 * @author: wangzhenqing
 * @date: 2015-08-05 17:53:58
 * @description: 状态
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
