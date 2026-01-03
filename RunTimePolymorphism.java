class Animal {
    void run() {
        System.out.println("Animal is running");
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }   
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }   
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.run();
        obj.sound();
    }
}
