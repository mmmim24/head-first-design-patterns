public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription() + ", Steamed milk";
    }

    @Override
    public double cost(){
        double cost = this.beverage.cost();
        Size size = this.beverage.getSize();
        if(size == Size.TALL)
            cost += 0.10;
        else if(size == Size.GRANDE)
            cost += 0.15;
        else if(size == Size.VENTI)
            cost += 0.20;
        return cost;
    }
}