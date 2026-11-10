class Animal {
    public void eat() {
        System.out.println("This animal is eating food.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog make Sound");
    }
}
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        //myDog.eat();
        myDog.bark();
    }
}
