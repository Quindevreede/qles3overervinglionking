package nl.novi.quin;
import java.util.ArrayList;

public class MiscAnimalController {
    private ArrayList<MiscAnimal> miscAnimals = new ArrayList<>();

    public MiscAnimalController() {
    }

    public void generateMiscAnimal() {
        System.out.println("");
        System.out.println("");
        MiscAnimal miscAnimal1 = new MiscAnimal("Timon", "meercat", "sarcastic", 2, "Nathan Lane");
        System.out.println("MEERCAT TIMON");
        miscAnimal1.sleep(23);
        miscAnimal1.eat("bugs");
        System.out.println("--");

        MiscAnimal miscAnimal2 = new MiscAnimal("Pumbaa", "warthog", "sweet", 2, "Ernie Sabella");
        System.out.println("WARTHOG PUMBAA");
        miscAnimal2.sleep(23);
        miscAnimal2.eat("bugs");
        System.out.println("--");

        MiscAnimal miscAnimal3 = new MiscAnimal("Rafiki", "mandrill", "wise", 2, "Robert Guillaume");
        System.out.println("MANDRILL RAFIKI");
        miscAnimal3.sleep(5);
        miscAnimal3.eat("fruit");
        System.out.println("--");

        MiscAnimal miscAnimal4 = new MiscAnimal("Zazu", "red-billed hornbill", "uptight", 2, "Rowan Atkinson");
        System.out.println("HORNBILL ZAZU");
        miscAnimal4.sleep(1);
        miscAnimal4.eat("seeds");
        System.out.println("");

        miscAnimals.add(miscAnimal1);
        miscAnimals.add(miscAnimal2);
        miscAnimals.add(miscAnimal3);
        miscAnimals.add(miscAnimal4);

    }

    public void printList() {
        int listSize = miscAnimals.size();

        for (int i = 0; i < listSize; i++) {
            MiscAnimal tmpMiscAnimal = miscAnimals.get(i);
            System.out.println(tmpMiscAnimal);
        }
    }

}
