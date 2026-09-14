public class Singleton{
    public volatile static Singleton uniqueInstance;

    private Singleton() {};

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void getDescription(){
        System.out.println("I am first time synchronized singleton class.");
    }
}