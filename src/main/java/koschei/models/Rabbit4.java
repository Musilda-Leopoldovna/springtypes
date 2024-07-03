package koschei.models;

public class Rabbit4 {

    private final Duck5 duck;

    public Rabbit4(Duck5 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "В зайце утка. " + duck.toString();
    }
}
