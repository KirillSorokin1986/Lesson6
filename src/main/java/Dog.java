public class Dog extends Animal {



    @Override
    public void run(int distanceRun) {
        if (distanceRun <= 500) {
        System.out.println("Собака пробежала " + distanceRun + " м."); }
        else {
            System.out.println("Собаке столько не пробежать");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim <= 10) {
        System.out.println("Собака проплыла " + distanceSwim + " м."); }
        else {
            System.out.println("Собаке столько не проплыть");
        }
    }
}


