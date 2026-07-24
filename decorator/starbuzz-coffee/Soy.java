public class Soy extends CondimentDecorator{
    public Soy(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost(){
        return this.beverage.cost() + 0.15;
    }
}