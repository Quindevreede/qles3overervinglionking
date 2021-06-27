package nl.novi.quin;

public class LionGood extends LionPride {
    private String offSpring;
    private boolean isFemale;

    public LionGood(String name, String species, String personality, int movieAppearances, String familyTree, boolean isDead, String offSpring, boolean isFemale) {
        super(name, species, personality, movieAppearances, familyTree, isDead);
        this.offSpring = offSpring;
        this.isFemale = isFemale;
    }

    public String getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String offSpring) {
        this.offSpring = offSpring;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    @Override
    public String toString() {
        return super.toString() + " GOOD {" +
                " Offspring : '" + offSpring + '\'' +
                ", is female = " + isFemale + '\'' +
                '}';
    }
}
