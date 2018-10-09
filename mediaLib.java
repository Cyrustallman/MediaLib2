
/**
 * Write a description of class mediaLib here.
 *
 * @author (Cyrus Tallman & Isaac Rinklef-Duma)
 * @version (a version number or a date)
 */
public class mediaLib
{
    
    public static void Media()
    {
       
        //media
        System.out.println("Welcome to your media library ajh");
        
        //song 1
        Song song1 = new Song("Darude sandstorm",2.0,10);
        System.out.println(song1.getTitle());
        System.out.println(song1.getPrice());
        System.out.println(song1.getRating());
        
        //song 2
        Song song2 = new Song("ee",2.1,1);
        System.out.println(song2.getTitle());
        System.out.println(song2.getPrice());
        System.out.println(song2.getRating());
        
        //song 3
        Song song3 = new Song("THRIRRD SOGN",0.99,23);
        System.out.println(song3.getTitle());
        System.out.println(song3.getPrice());
        System.out.println(song3.getRating());
        
        //song avgs
        System.out.println("song avg");
        System.out.println(song3.getNumSongs());
        System.out.println(song2.getNumSongs());
        System.out.println(song1.getNumSongs());
        
        //movie original
        Movie movie1 = new Movie();
        movie1.setName("the");
        System.out.println(movie1.getName());
        movie1.setRottenTomatos(17776767);
        System.out.println(movie1.getRottenTomatos());
        
        //book original
        Book book1 = new Book();
        book1.setTitle("the book");
        System.out.println(book1.getTitle());
        book1.setStars(34);
        System.out.println(book1.getStars());
    }
}
