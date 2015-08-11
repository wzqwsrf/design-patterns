package compound.adapter;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 10:42:48
 * @description: 鸭子模拟器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulator();
    }

    public void simulator() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(goose);
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
