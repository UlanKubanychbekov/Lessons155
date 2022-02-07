package peaksoft;

public class Programmer extends Person {
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
        super.learn();
        super.walk();
        super.eat();
    }


    public String toString() {
        return "Имя : " + name + ". Название компании : " + companyName + ". профессия: " + designation + "!" + " ";
    }

    public void coding() {
        System.out.println("умеет писать код на 5 языках");
    }


}
