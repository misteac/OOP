public class Cat extends Animal implements Goable, Swimable, Flyable {

    public Cat(Boolean toGo, Boolean fly, Boolean swim) {
        super(toGo, fly, swim);
    }

    @Override
    public Double flySpeed() {
        return 0.0;
    }

    @Override
    public Double runSpeed() {
        return 35.0;
    }

    @Override
    public Double swimSpeed() {
        return 0.0;
    }

}