package com.design.pattern.state;

/**
 * @author: wangzhenqing
 * @date: 2015-08-05 17:53:58
 * @description: 状态
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
