public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.run(150);
        cat.swim(8);
        dog.run(600);
        dog.swim(8);
        System.out.println("Создано животных: " + Animal.animalCount);
    }


}
