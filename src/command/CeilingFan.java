package command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 16:53:53
 * @description: 转速
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    String name;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void on() {
        System.out.println(name + " CeilingFan on!");
    }

    public void off() {
        speed = OFF;
        System.out.println(name + " CeilingFan off!");
    }

    public void high() {
        speed = HIGH;
        System.out.println(name + " CeilingFan high!");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(name + " CeilingFan medium!");
    }

    public void low() {
        speed = LOW;
        System.out.println(name + " CeilingFan low!");
    }

    public int getSpeed() {
        return speed;
    }
}
