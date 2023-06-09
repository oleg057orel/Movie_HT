import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

   @Test
    public void AddMovie() {
       MovieManager manager = new MovieManager();

       manager.add("Film 1");
       manager.add("Film 2");
       manager.add("Film 3");

       String[] expected = {"Film 1", "Film 2", "Film 3"};
       String[] actual = manager.findAll();
       Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void AddNullMovie() {
      MovieManager manager = new MovieManager();

      String[] expected = { };
      String[] actual = manager.findAll();
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void AddOneMovie() {
      MovieManager manager = new MovieManager();

      manager.add("Film 1");

      String[] expected = {"Film 1"};
      String[] actual = manager.findAll();
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void AddOneMovieLimit() {
      MovieManager manager = new MovieManager();

      manager.add("Film 1");
      manager.add("Film 2");
      manager.add("Film 3");
      manager.add("Film 4");
      manager.add("Film 5");
      manager.add("Film 6");

      String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
      String[] actual = manager.findAll();
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void FindMovie() {
      MovieManager manager = new MovieManager();

      manager.add("Film 1");
      manager.add("Film 2");
      manager.add("Film 3");

      manager.findLast();

      String[] expected = {"Film 3", "Film 2", "Film 1"};
      String[] actual = manager.findLast();
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void FindMovieLimit() {
      MovieManager manager = new MovieManager();

      manager.add("Film 1");
      manager.add("Film 2");
      manager.add("Film 3");
      manager.add("Film 4");
      manager.add("Film 5");
      manager.add("Film 6");

      manager.findLast();

      String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
      String[] actual = manager.findLast();
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void FindMovieAll() {
      MovieManager manager = new MovieManager();

      manager.add("Film 1");
      manager.add("Film 2");
      manager.add("Film 3");
      manager.add("Film 4");
      manager.add("Film 5");

      manager.findAll();

      String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
      String[] actual = manager.findLast();
      Assertions.assertArrayEquals(expected, actual);
   }




}
