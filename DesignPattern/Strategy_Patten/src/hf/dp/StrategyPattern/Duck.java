package hf.dp.StrategyPattern;

public abstract class Duck {
    FlyBehavior flyBehavior;//행동
    QuackBehavior quackBehavior;//행동

    public Duck() {}

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
    public void swim(){
        System.out.println("all ducks float,even decoys!");
    }
}
