public class Main{
public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    @Override
   public String toString(){
        return String.format("Animal[name=%s]",this.name);
   }
}

public class Mammal extends Animal  {
    String name;
    public Mammal(String name){
        super(name);

    }
    @Override
    public String toString(){
        return String.format("Mammal[%s]",super.toString());
    }

}

public class Cat extends Mammal{
    String name;
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return String.format("Cat[%s]",super.toString());
    }

}

public class Dog extends Mammal{
    String name;
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return String.format("Dog[%s]",super.toString());
    }
}
}
