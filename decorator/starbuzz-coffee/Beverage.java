public abstract class Beverage{
    public enum Size { TALL, GRANDE, VENTI };
    private Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public void setSize(Size size){
        if (size == Size.TALL) this.description += " Small"; 
        else if (size == Size.GRANDE) this.description += " Medium";
        else if (size == Size.VENTI) this.description += " Large";
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();
    public abstract String costString();
}