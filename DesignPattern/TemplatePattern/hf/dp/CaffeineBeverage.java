package hf.dp.TemplatePattern.hf.dp;

public abstract class CaffeineBeverage {



    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }


}
