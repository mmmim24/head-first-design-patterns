public abstract class Pizza{
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    Veggies veggies[];

    abstract void prepare();

    void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

	@Override
    public String toString(){
        StringBuffer result = new StringBuffer();
		result.append("---- " + this.name + " ----\n");
		if (dough != null) {
			result.append(this.dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(this.sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(this.cheese);
			result.append("\n");
		}
		if (clams != null) {
			result.append(this.clams);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(this.pepperoni);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < this.veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		return result.toString();
    }
}