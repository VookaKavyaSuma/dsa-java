import java.util.*;

    interface Vehicle{
        void start();
        void stop();
        void fuelType();
    }

    class Car implements Vehicle{
        public void start(){
            System.out.println("The Car is starting witk key.");
        }
        public void stop(){
            System.out.println("Car has stopped");
        }
        public void fuelType(){
            System.out.println("Car runs on petrol or diesel");
        }
    }

    class Bike implements Vehicle{
        public void start(){
            System.out.println("The bike will also start with key");
        }
        public void stop(){
            System.out.println("Bike has stopped");
        }
        public void fuelType(){
            System.out.println("Bike runs on petrol");
        }
    }
    public class Interface{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            Vehicle v=new Bike();
            switch(choice){
                case 1 -> v=new Car();
                case 2 -> v=new Bike();
            }
            v.start();
            v.stop();
            v.fuelType();
        }
    }
}