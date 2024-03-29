public class Dog extends Animal implements Goable, Swimable, Flyable {

    public Dog(Boolean toGo, Boolean fly, Boolean swim) {
        super(toGo, fly, swim);
    }

    @Override
    public Double flySpeed() {
        return 0.0;
    }

    @Override
    public Double runSpeed() {
        return 25.0;
    }

    @Override
    public Double swimSpeed() {
        return 5.0;
    }

}