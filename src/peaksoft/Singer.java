package peaksoft;

public class Singer extends Person {
    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
        super.learn();
        super.walk();
        super.eat();
    }

    public Singer() {

    }

    @Override
    public String toString() {
        return "Имя : " + name + ". Название банды : " + bandName + ". профессия: " + designation + "!" + " ";

    }

    public void singing() {
        System.out.println(name + " поет песню про войну, ");

    }

    public void playGitar() {
        System.out.println(name + " играет на гитаре как Виктор Цой!");


    }
}
