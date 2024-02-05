public class Duck extends Animal implements Goable, Swimable, Flyable {

    public Duck(Boolean toGo, Boolean fly, Boolean swim) {
        super(toGo, fly, swim);
    }

    @Override
    public Double flySpeed() {
        return 40.0;
    }

    @Override
    public Double runSpeed() {
        return 5.0;
    }

    @Override
    public Double swimSpeed() {
        return 10.0;
    }

}