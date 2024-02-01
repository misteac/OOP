public class Cat extends Animal {

    public Cat(Boolean toGo, Boolean fly, Boolean swim) {
        super(toGo, fly, swim);
    }

    @Override
    public Boolean toGo() {
        return true;
    }

    @Override
    public Boolean fly() {
        return false;
    }

    @Override
    public Boolean swim() {
        return false;
    }
}