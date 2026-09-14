public class ChocolateBoiler{
    private boolean empty,boiled;
    private volatile static ChocolateBoiler uniqueInstance;
    
    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
    
    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
            synchronized(ChocolateBoiler.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateBoiler();
                }
            }
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
    }

    public void fill() {
		if (isEmpty()){
			this.empty = false;
            System.out.println("The boiler is filled but not boiled");
        } 
	}

	public void boil() {
        if (!isEmpty() && !isBoiled()){
            this.boiled = true;
            System.out.println("The boiler is boiled but not drained");
        }
	}
    
    public void drain() {
        if (!isEmpty() && isBoiled()){
            this.empty = true;
            this.boiled = false;
            System.out.println("The boiler is drained");
        }
    }
}