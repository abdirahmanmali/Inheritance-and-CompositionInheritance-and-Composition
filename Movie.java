import java.util.ArrayList;
public class Movie extends Media {
    private  int length;

    private  String description;

    private double grossing;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public double getGrossing() {
        return grossing;
    }

    public void setGrossing(double grossing) {
        this.grossing = grossing;
    }

    public Movie(java.lang.String title, java.lang.String rating, Director director, ArrayList<Actor> cast, int length,
                 java.lang.String description, double grossing) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;



    }
}