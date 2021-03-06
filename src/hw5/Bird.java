package hw5;

public class Bird extends Animal {
    Bird(String name, float maxRun, float maxSwim, float maxJump) {
        super("Птица", name, maxRun, maxSwim, maxJump);
    }

    @Override
    public int swim(float distance){
        return  Animal.swim_none;
    }
}
