package iterator;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 18:08:14
 * @description: 测试类
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(panCakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
