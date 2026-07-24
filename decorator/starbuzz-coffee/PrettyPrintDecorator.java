import java.util.LinkedHashMap;

public class PrettyPrintDecorator extends CondimentDecorator{
    public PrettyPrintDecorator(Beverage b){
        this.beverage = b;
    }

    private String res = "";
    private Integer c = 0;
    
    @Override
    public String getDescription(){
        String[] ingredients = this.beverage.getDescription().split(", ");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for(String word : ingredients){
            count.put(word, count.getOrDefault(word, 0)+1);
        }

        count.forEach((key, value) -> {
            c++;
            if(c!=1) 
                res += ", ";
            if(c==2)
                res += "with ";
            if(value==1) 
                res += key;
            else if(value==2) 
                res += "Double " + key;
            else if(value==3) 
                res += "Triple " + key;
            else 
                res += key + "(x" + value + ")";
        });

        return res;
    }

    @Override
    public double cost(){
        return this.beverage.cost();
    }

    @Override
    public String costString(){
        return " $"+String.format("%.2f", this.beverage.cost());
    }
}