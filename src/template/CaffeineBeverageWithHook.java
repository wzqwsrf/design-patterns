package template;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 11:32:31
 * @description: 抽象基类 带钩子
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }
}
