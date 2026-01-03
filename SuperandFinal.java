    class Animal{
        String name = "Generic Animal";
        Animal(){
            System.out.println("Animal constructor is called");
        }                                      
    }
    class Dog extends Animal{
        String name = "Puppy";
        Dog(){
            super();
            System.out.println("Dog constructor is called");
        }
        void displayNames(){
            System.out.println("Name of parent(Animal): " + super.name);
            System.out.println("Name of child class is : " + name);
        }
    }
    //Final class
    final class Cat{
        void meow(){
            System.out.println("Cat says Meow!");
        }
    }
    /*class Kitten extends Cat(){
        Cannot extends because cat is of final class
    }*/
    //Final method
    class Bird{
        final void fly(){
            System.out.println("Birds always fly");
        }
    }
    class Sparrow extends Bird{
      /*   void fly(){
            System.out.println("Sparrow also flies");
        }*/
    }
    public class SuperandFinal{
        public static void main(String[] args) {
            Dog d = new Dog();
            d.displayNames();
            Cat c = new Cat();
            c.meow();
            Sparrow s = new Sparrow();
            s.fly();
        }
    }

