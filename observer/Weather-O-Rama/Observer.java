public interface Observer{
    public void update();
    default void subscribe(Subject s){
        s.registerObserver(this);
    }
    default void unsubscribe(Subject s){
        s.removeObserver(this);
    }
}