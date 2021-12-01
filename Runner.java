package Maria;

public class Runner {
    private Runner() {}

    private static class SingletonHolder {
        private static final Runner INSTANCE = new Runner();
    }

    public static Runner getInstance() {
        return SingletonHolder.INSTANCE;
    }
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}