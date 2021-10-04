public class Animal {

    private String name;
    private String color;
    private int age;
    private boolean canSwim;
    static int animalCount;

    public Animal () {
        animalCount++;
    }




    public void run(int distanceRun) {
        System.out.println("Animal runs " + distanceRun + " м.");
    }

    public void swim(int distanceSwim) {
        System.out.println("Animal swims " + distanceSwim + " м.");
    }


}
