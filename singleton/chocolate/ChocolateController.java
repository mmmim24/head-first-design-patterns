public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        System.out.println("boiler one is empty = " + boiler.isEmpty());
		boiler.fill();
        System.out.println("boiler two is empty = " + boiler2.isEmpty());
		boiler2.boil();
        System.out.println("boiler one is boiled = " + boiler.isBoiled());
		boiler.drain();
        System.out.println("boiler two is boiled = " + boiler2.isBoiled());
	}
}