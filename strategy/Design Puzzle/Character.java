public abstract class Character{
    String name;
    String heroTier;
    WeaponBehavior weapon;
    
    public void display(){
        System.out.println("I am the "+name+heroTier+"\n");
    }

    public void setWeapon(WeaponBehavior w){
        weapon = w;
    }

    public void fight(){
        weapon.useWeapon();
    }

    public abstract void chooseWeapon();
}   