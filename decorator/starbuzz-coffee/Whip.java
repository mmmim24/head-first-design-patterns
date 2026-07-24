public class Whip extends CondimentDecorator{
    public Whip(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost(){
        return this.beverage.cost() + 0.10;
    }
}