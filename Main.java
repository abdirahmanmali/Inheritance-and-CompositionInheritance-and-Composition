
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Creating instances of each class

        Director director = new Director("Abdirahman Ali");
        ArrayList<Actor> Cast = new ArrayList<>();
        Cast.add(new Actor("said farah"));
        Cast.add(new Actor("warya") );

        Movie movie = new Movie("learning java ", "PG",
                director,Cast,120,
                "Learning java in 6months program ", 1.5);

        TvShow tvshows = new TvShow("bootcamp", "PG",director,  Cast,
                9,120);
        System.out.println("movies :" + movie.getTitle() + ",Rating "+ movie.getRating());
        System.out.println("Tvshows :" + tvshows.getTitle() + " Rating "+ tvshows.getRating());
    


    }
}