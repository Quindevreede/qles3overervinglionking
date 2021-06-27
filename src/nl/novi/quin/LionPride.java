package nl.novi.quin;

public abstract class LionPride extends Animal {
    private String familyTree;
    private boolean isDead;

    public LionPride(String name, String species, String personality, int movieAppearances, String familyTree, boolean isDead) {
        super(name, species, personality, movieAppearances);
        this.familyTree = familyTree;
        this.isDead = isDead;
    }

    public void move() {
        System.out.println("Moved 1 mile.");
    }

    public String getFamilyTree() {
        return familyTree;
    }

    public void setFamilyTree(String familyTree) {
        this.familyTree = familyTree;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void sound() {
        System.out.println("Roar!");
    }


    @Override
    public String toString() {
        return super.toString() + " LION {" +
        " Relation to Simba '" + familyTree + '\'' +
        ", has died = " + isDead + '\'' +
        '}';

    }
}

