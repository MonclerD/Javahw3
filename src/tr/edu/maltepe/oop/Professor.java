package tr.edu.maltepe.oop;

public class Professor {
    private String name;
    public Professor ( String name) {
        this.name = name;
    }
    public Professor(){

    }
    public String setName() { return name;
    }
    public void setName(String name) { this.name = name; }
    public void reads(Book b1){
        System.out.println(setName() + " Reading Oop book");

    }



}
