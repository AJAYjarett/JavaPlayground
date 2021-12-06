package oop.animal_farm;

public class Fox extends Animal implements Canine{

    public Fox() {
        super(4);
    }

    @Override
    public String eat() {
        return "anything, yum";
    }

    @Override
    public String sound() {
        return "Screeches";
    }

    public static void main(String[] args) {
        Fox bill = new Fox();
        bill.sleep();
        System.out.println(bill.eat());
    }

    @Override
    public String hunt() {
        return "goes through trash";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}
