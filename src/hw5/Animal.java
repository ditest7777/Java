package hw5;

public class Animal {
    static final int swim_fail = 0;
    static final int swim_ok = 1;
    static final int swim_none = -1;

    private String type;
    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;

   public Animal(String type, String name, float maxRun, float maxSwim, float maxJump){
       this.type = type;
       this.name = name;
       this.maxRun = maxRun;
       this.maxSwim = maxSwim;
       this.maxJump = maxJump;
   }

    public String getType() {
        return this.type;
    }

   public String getName() {
       return this.name;
   }

   public float getMaxRun() {
       return this.maxRun;
   }

   public float getMaxSwim(){
       return this.maxSwim;
   }

    public float getMaxJump() {
        return this.maxJump;
    }

    protected boolean run(float distance) {
       return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? swim_ok : swim_fail;
    }

    protected boolean jump(float distance) {
        return (distance <= maxJump);
    }

}
