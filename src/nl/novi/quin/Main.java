package nl.novi.quin;

public class Main {

    public static void main(String[] args) {
        LionController lions = new LionController();
        lions.generateLionGood();
        lions.printList();

        HyenaController hyenas = new HyenaController();
        hyenas.generateHyena();
        hyenas.printList();

        MiscAnimalController miscAnimals = new MiscAnimalController();
        miscAnimals.generateMiscAnimal();
        miscAnimals.printList();
    }
}
