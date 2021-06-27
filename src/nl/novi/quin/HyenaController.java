package nl.novi.quin;
import java.util.ArrayList;

public class HyenaController {
    private ArrayList<Hyena> hyenas = new ArrayList<>();

    public HyenaController() {
    }

    public void generateHyena() {
        System.out.println("");
        System.out.println("");
        Hyena hyena1 = new Hyena("Shenzi", "hyena", "mean", 1, "hahahaha", 1);
        System.out.println("HYENA SHENZI");
        hyena1.sleep(18);
        hyena1.eat("lion");
        System.out.println("--");

        Hyena hyena2 = new Hyena("Banzai", "hyena", "funny", 1, "hehehe", 2);
        System.out.println("HYENA BANZAI");
        hyena2.sleep(15);
        hyena2.eat("lion");
        System.out.println("--");

        Hyena hyena3 = new Hyena("Ed", "hyena", "mental", 1, "hihihi", 3);
        System.out.println("HYENA ED");
        hyena3.sleep(19);
        hyena3.eat("lion");

        System.out.println("");

        hyenas.add(hyena1);
        hyenas.add(hyena2);
        hyenas.add(hyena3);

    }

    public void printList() {
        int listSize = hyenas.size();

        for (int i = 0; i < listSize; i++) {
            Hyena tmpHyena = hyenas.get(i);
            System.out.println(tmpHyena);
        }
    }

}
