package adapter;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 16:10:07
 * @description: 鸭子适配器测试
 */
public class TurkeyTestDrive {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();

        MallardDuck duck = new MallardDuck();
        DuckAdapter adapter = new DuckAdapter(duck);

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(adapter);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
