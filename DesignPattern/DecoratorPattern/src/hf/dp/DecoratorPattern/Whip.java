package hf.dp.DecoratorPattern;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        return beverage.cost()+1.19;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"Whip";
    }
}
