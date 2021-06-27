package nl.novi.quin;
import java.util.ArrayList;

public class LionController {
    private ArrayList<LionPride> lions = new ArrayList<>();

    public LionController() {
    }

    public void generateLionGood() {
        LionGood lion1 = new LionGood("Mufasa", "lion", "stern", 1, "father", true, "Simba & Nala", false);
        System.out.println("");
        System.out.println("LION MUFASA :");
        lion1.eat("antilope");
        lion1.sleep(6);
        System.out.println("I will ROAR 3 times...");
        lion1.sound();
        lion1.sound();
        lion1.sound();

        LionGood lion2 = new LionGood("Sarabi", "lion", "caring", 2, "mother", false, "Simba", true);
        System.out.println("--");
        System.out.println("LION SARABI:");
        lion2.eat("zebra");
        lion2.sleep(4);
        lion2.move();
        System.out.println("I will ROAR 2 times...");
        lion2.sound();
        lion2.sound();

        LionGood lion3 = new LionGood("Simba", "lion", "heroic", 2, "= Simba", false, "Kiara", false);
        System.out.println("--");
        System.out.println("LION SIMBA:");
        lion2.eat("bugs");
        lion2.sleep(8);
        System.out.println("I will ROAR 1 time...");
        lion2.sound();
        lion2.move();
        lion2.move();
        lion2.move();
        lion2.move();

        LionGood lion4 = new LionGood("Nala", "lion","lovely", 2, "half-sister", false, "Kiara", true);
        System.out.println("--");
        System.out.println("LION NALA:");
        lion4.eat("antilope");
        lion4.sleep(7);
        System.out.println("I will ROAR 3 times...");
        lion4.sound();
        lion4.sound();
        lion4.sound();
        lion4.move();
        lion4.move();

        LionGood lion5 = new LionGood("Sarafina", "lion", "motherly", 2, "mother-in-law", false, "Nala", true);
        System.out.println("--");
        System.out.println("LION SARAFINA:");
        lion5.eat("zebra");
        lion5.sleep(2);
        System.out.println("I will ROAR 2 times...");
        lion5.sound();
        lion5.sound();
        lion5.move();

        LionGood lion6 = new LionGood("Kiara", "lion", "adorable", 2, "daughter", false, "none", true);
        System.out.println("--");
        System.out.println("LION KIARA:");
        lion6.eat("milk");
        lion6.sleep(13);

        LionEvil lion666 = new LionEvil("Scar", "lion", "evil", 1, "uncle", true, "none", false);
        System.out.println("---");
        System.out.println("LION SCAR :");
        lion1.eat("everything");
        lion1.sleep(666);
        System.out.println("I will ROAR 1 time...");
        lion1.sound();

        System.out.println("");

        lions.add(lion1);
        lions.add(lion2);
        lions.add(lion3);
        lions.add(lion4);
        lions.add(lion5);
        lions.add(lion6);
        lions.add(lion666);


}

    public void printList() {
        int listSize = lions.size();

        for (int i = 0; i < listSize; i++) {
            Animal tmpAnimal = lions.get(i);
            System.out.println(tmpAnimal);
        }
    }
}
