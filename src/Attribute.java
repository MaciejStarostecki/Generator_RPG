public class Attribute {
    String name;
    int starting = 0;
    int advances = 0;
    int summary = starting + advances;

    public Attribute (int starting) {
        this.starting = starting;
    }

    public void raiseAttribute(int value) {
        advances += value;
    }
}
