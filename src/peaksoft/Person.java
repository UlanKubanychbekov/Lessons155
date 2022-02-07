package peaksoft;

public class Person {
    String name;
    String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {

    }


    public void learn() {
        System.out.println(name+" продолжает изучать свою профессию, ");
    }

    public void walk() {
        System.out.println(name+" каждый день ходит чтобы учиться, ");
    }

    public void eat() {
        System.out.println(name+" не есть после 18:00, ");



    }

}

