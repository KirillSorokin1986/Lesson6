
public class Cat extends Animal {

    @Override
    public void run(int distanceRun) {
        if (distanceRun <= 200) {
            System.out.println("Кошка пробежала " + distanceRun + " м.");
        } else {
            System.out.println("Кошке столько не пробежать");
        }

    }


    @Override
    public void swim(int distanceSwim) {
        System.out.println("Кошка не умеет плавать");
    }
}


