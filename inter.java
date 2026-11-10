interface Animal {
    void eat(); 
}
class Dog implements Animal {
    public void eat() {
        System.out.println("The dog is eating.");
    }
}
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
    }
}
