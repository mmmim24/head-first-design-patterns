import java.util.*;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();

	public String getName() {
		return this.name;
	}

	public void prepare() {
		System.out.println("Preparing " + this.name);
	}

	public void bake() {
		System.out.println("Baking " + this.name);
	}

	public void cut() {
		System.out.println("Cutting " + this.name);
	}

	public void box() {
		System.out.println("Boxing " + this.name);
	}

    @Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		display.append(this.dough + "\n");
		display.append(this.sauce + "\n");
		for (String topping : this.toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}