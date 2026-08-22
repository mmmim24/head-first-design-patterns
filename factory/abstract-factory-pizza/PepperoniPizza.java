public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

    @Override
	void prepare() {
		System.out.println("Preparing " + this.name);
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
		this.veggies = ingredientFactory.createVeggies();
		this.pepperoni = ingredientFactory.createPepperoni();
	}
}