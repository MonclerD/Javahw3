package tr.edu.maltepe.oop;

public class Main {


    public static void main(String[] args) {

      Student s1 = new Student();
      Professor p1 = new Professor();
      Book b1 = new Book("Oop");


      s1.setName("Emin");
      s1.reads(b1);
      p1.setName("Ensar");
      p1.reads(b1);
      b1.getTitle("Oop");

    }


}
