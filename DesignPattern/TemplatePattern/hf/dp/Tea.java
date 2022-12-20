package hf.dp.TemplatePattern.hf.dp;

public class Tea extends CaffeineBeverage {




    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
