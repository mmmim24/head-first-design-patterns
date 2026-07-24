public class StarbuzzCoffee{
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +" $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +" $"+beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() +" $"+beverage3.cost());
        
        Beverage coffee = new Decaf();
        coffee.setSize(Beverage.Size.GRANDE);
        coffee = new SteamedMilk(coffee);
        coffee = new Mocha(coffee);
        System.out.println(coffee.getDescription() +" $"+coffee.cost());
        
        System.out.println("\n-----Using PrettiPrintDecorator-----\n");
        beverage = new PrettyPrintDecorator(beverage);
        System.out.println(beverage.getDescription() + beverage.costString());
        beverage2 = new PrettyPrintDecorator(beverage2);
        System.out.println(beverage2.getDescription() + beverage2.costString());
        beverage3 = new PrettyPrintDecorator(beverage3);
        System.out.println(beverage3.getDescription() + beverage3.costString());
        coffee = new PrettyPrintDecorator(coffee);
        System.out.println(coffee.getDescription() + coffee.costString());
    }
}