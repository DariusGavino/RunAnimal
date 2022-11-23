import java.util.*;

public class RunAnimal{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        Dog woof = new Dog();
        Bird tweet = new Bird();
        Cat meow = new Cat();

        System.out.println("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
        String a = sc.nextLine();

        if(a.equalsIgnoreCase("B")){
            tweet.eat();
            tweet.sleep();
            tweet.makeSound();
        }
        else if(a.equalsIgnoreCase("C")){
            meow.eat();
            meow.sleep();
            meow.makeSound();
      }
        else if(a.equalsIgnoreCase("D")){
            woof.eat();
            woof.sleep();
            woof.makeSound();
        }

        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
