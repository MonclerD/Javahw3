package tr.edu.maltepe.oop;

public class Student {
    private String name;

    public Student ( String name) {
        this.name = name;
    }
    public Student(){

    }
    public String setName() { return name;
    }
    public void setName(String name) { this.name = name; }
    public void reads(Book b1){
        System.out.println(setName() + " Reading Oop book");
    }


}

