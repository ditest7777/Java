package hw5;

public class Cat extends Animal {
    Cat(String name, float maxRun, float maxSwim, float maxJump) {
        super("Кошка", name, maxRun, maxSwim, maxJump);
    }

    @Override
    public int swim(float distance){
    return  Animal.swim_none;
    }
}
