package tr.edu.maltepe.oop;

public class Book {
   private String title;

   public Book ( String title) {
       this.title = title;
   }
   public Book(){

   }
   public String getTitle() { return title;
   }
   public void getTitle(String title) { this.title = title; }

}
