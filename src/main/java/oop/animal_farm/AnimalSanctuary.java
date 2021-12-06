package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {

    private Dog bernie = new Dog();
    private Dog billy = new Dog();
    private Fox bill = new Fox();
    private Fox lisa = new Fox();
    private List<Animal> animalsInSanctuary = new ArrayList<>();
    private List<Fox> foxesInSanctuary = new ArrayList<>();

    public AnimalSanctuary() {
        foxesInSanctuary.add(bill);
        foxesInSanctuary.add(lisa);

        animalsInSanctuary.add(bernie);
        animalsInSanctuary.add(billy);

    }

}
