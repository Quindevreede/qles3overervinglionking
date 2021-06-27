package nl.novi.quin;

public abstract class Animal {
    private String name;
    private String personality;
    private String species;
    private int movieAppearances;

    public Animal(String name, String species, String personality, int movieAppearances) {
        this.name = name;
        this.personality = personality;
        this.species = species;
        this.movieAppearances = movieAppearances;
    }

    public void eat(String food) {
        System.out.println("I ate some " + food);
    }

    public void sleep(int hoursSlept) {
        System.out.println("I Slept for " + hoursSlept + " hours");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMovieAppearances() {
        return movieAppearances;
    }

    public void setMovieAppearances(int movieAppearances) {
        this.movieAppearances = movieAppearances;
    }

    @Override
    public String toString() {
        return "Animal{" +
                " name = '" + name + '\'' +
                ", personality = '" + personality + '\'' +
                ", species = '" + species + '\'' +
                ", animated movie appearances = '" + movieAppearances + '\'' +
                " }";
    }
}
