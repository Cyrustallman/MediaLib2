
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int RottenTomatos;
    private String name;
    private int duration;
    public Movie()
    {
        // initialise instance variables
        RottenTomatos = 0;
        name = "";
        duration = 0;
    }
    //duration
    public void setDuration(int duration2) {
         duration = duration2;
    }
    public int getDuration() {
        return duration;
    }
    //name 
    public void setName(String name2) {
        name = name2;
    }
    public String getName() {
        return name;
    }
    //rotten tomaots
    public void setRottenTomatos(int RottenTomatos2) {
        RottenTomatos = RottenTomatos2;
    }
    public int getRottenTomatos() {
        return RottenTomatos;
    }
}
