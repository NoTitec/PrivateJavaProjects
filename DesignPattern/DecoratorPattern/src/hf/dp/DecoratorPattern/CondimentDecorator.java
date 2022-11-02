package hf.dp.DecoratorPattern;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    public abstract String getDescription();
}
