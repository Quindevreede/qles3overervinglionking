package nl.novi.quin;
import java.time.*;
import java.time.DayOfWeek;

public class Hyena extends Animal{
    private DayOfWeek lastDayFed;
    private String laugh;
    private int num;

    public Hyena(String name, String species, String personality, int movieAppearances, String laugh, int num) {
        super(name, species, personality, movieAppearances);
        this.lastDayFed = lastDayFed;
        this.laugh = laugh;
        this.num = num;
    }

    public DayOfWeek getLastDayFed() {
        return lastDayFed;
    }

    public void setLastDayFed(DayOfWeek lastDayFed) {
        this.lastDayFed = lastDayFed;
    }

    public String getLaugh() {
        return laugh;
    }

    public void setLaugh(String laugh) {
        this.laugh = laugh;
    }

    public void sound() {
        System.out.println("HAHAHA!");
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    LocalDate localDate
            = LocalDate.of(1994,
            Month.JUNE, 12);

    // Find the day from the local date
    DayOfWeek dayOfWeek
            = DayOfWeek.from(localDate);

    // Printing the day of the week
    // and its Int value
        /*System.out.println("Day of the Week on"
                + " 15th August 1947 - "
                + dayOfWeek.name());*/
    @Override
    public String toString() {
        return super.toString() + " BAD {" +
                " Hyena number: '" + num + '\'' +
                ", sound = '" + laugh + '\'' +
                " and had it's last meal on"
                + " 12th June 1994 - it was a "
                + dayOfWeek +
                '}';
    }
}
