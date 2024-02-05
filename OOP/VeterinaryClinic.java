import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<>();

    public VeterinaryClinic addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "VeterinaryClinic{" +
                "animals=" + animals +
                '}';
    }

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Goable) {
                result.add((Goable) item);
            }

        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable) {
                flyables.add((Flyable) item);
            }
        }
        return flyables;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> swimables = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Swimable) {
                swimables.add((Swimable) item);
            }
        }
        return swimables;
    }
}