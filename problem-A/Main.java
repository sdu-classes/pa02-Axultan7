public class Main {
    public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Elephant");
        System.out.println(animal);
        Mammal mammal = new Mammal("Bear");
        System.out.println(mammal);
        Cat cat = new Cat("Smoki");
        cat.greets();
        System.out.println(cat);
        Dog dog1 = new Dog("Sharik");
        dog1.greets();
        Dog another = new Dog("Tuzik");
        dog1.greets(another);
        System.out.println(dog1);

    }
}
}
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
