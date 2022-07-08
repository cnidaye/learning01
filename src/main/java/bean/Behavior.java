package bean;

public interface Behavior {
    void eat(String food);

    void eat(String food, int unit);

    void eat(int unit, String food);
}
