
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
        
        //song origial
        Song song1 = new Song();
        song1.setTitle("bus");  
        System.out.println(song1.getTitle());
        song1.setRating(1888);
        System.out.println(song1.getRating());
        song1.setPrice(2.0);
        System.out.println(song1.getPrice());
        
        //song 2
        Song song2 = new Song("ee",2.1,1);
        System.out.println(song2.getTitle());
        System.out.println(song2.getPrice());
        System.out.println(song2.getRating());
        
        //song 3
        Song song3 = new Song("THRIRRD SOGN",.99,23);
        System.out.println(song3.getTitle());
        System.out.println(song3.getPrice());
        System.out.println(song3.getRating());
        
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
