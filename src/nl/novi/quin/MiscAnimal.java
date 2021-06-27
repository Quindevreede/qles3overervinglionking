package nl.novi.quin;

public class MiscAnimal extends Animal {
    private String voicedBy;

    public MiscAnimal(String name, String species, String personality, int movieAppearances, String voicedBy) {
        super(name, species, personality, movieAppearances);
        this.voicedBy = voicedBy;
    }

    public String getVoicedBy() {
        return voicedBy;
    }

    public void setVoicedBy(String voicedBy) {
        this.voicedBy = voicedBy;
    }
    @Override
    public String toString() {
        return super.toString() + " GOOD {" +
                " Voiced by actor : '" + voicedBy + '\'' +
                '}';
    }

}

