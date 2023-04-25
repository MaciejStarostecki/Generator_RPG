public class Skill {
    String name = null;
    boolean advanced = false;
    private int level = 0;
    public Skill (String name, boolean advanced, int level) {
        this.name = name;
        this.advanced = advanced;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void increaseLevel(int add) {
        this.level += add;
    }
}

class CosTam extends Skill {
    public CosTam () {
        super("Cos tam", true, 20);
    }

    public CosTam (int level) {
        super("Cos tam", true, level);
    }
}