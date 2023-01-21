public class Dog {

    // 2.Create a Dog Class and create 3 different objects of it:
    // Husky, Bulldog, Labrador  with specific  attributes and behaviors.

    String breed;
    String color;
    int weight;
    int age;
    boolean pottyTrained;
    boolean active;

    void speak() {
        System.out.println("Woof...Woof...Woof");
    }

    void howl() {
        System.out.println("Ahooooooooooo");
    }

    void eat() {
        System.out.println("Dog is chewing...");
    }

    void play() {
        System.out.println("Dog is fetching the ball...");
    }

    void sleep() {
        System.out.println("zzzZZZ");
    }

    public static void main(String[] args) {

        System.out.println("Husky");
        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.color = "Black & White";
        dog1.weight = 60;
        dog1.age = 2;
        dog1.pottyTrained = false;
        dog1.active = true;

        dog1.speak();
        dog1.howl();
        dog1.eat();
        dog1.play();
        dog1.sleep();

        System.out.println("--------------------");

        System.out.println("Bulldog");
        Dog dog2 = new Dog();
        dog2.breed = "Bulldog";
        dog2.color = "White";
        dog2.weight = 90;
        dog2.age = 5;
        dog2.pottyTrained = true;
        dog2.active = false;

        dog2.speak();
        dog2.howl();
        dog2.eat();
        dog2.play();
        dog2.sleep();

        System.out.println("--------------------");

        System.out.println("Labrador");
        Dog dog3 = new Dog();
        dog3.breed = "Labrador";
        dog3.color = "Black";
        dog3.weight = 75;
        dog3.age = 8;
        dog3.pottyTrained = true;
        dog3.active = true;

        dog3.speak();
        dog3.howl();
        dog3.eat();
        dog3.play();
        dog3.sleep();


    }
}

