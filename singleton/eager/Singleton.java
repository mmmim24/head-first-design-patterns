public class Singleton{
    public static Singleton uniqueInstance = new Singleton();

    private Singleton() {};

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public void getDescription(){
        System.out.println("I am an eagerly created singleton instance");
    }
}