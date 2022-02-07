package peaksoft;

public class Dancer extends Person {
    private String groupName;


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
        super.learn();
        super.walk();
        super.eat();
    }

        public String toString() {
            return "Имя : " + name + ". название группы: " + groupName + ". профессия: " + designation + "!" + " ";
    }


    public void dancing() {
        System.out.println(name + " несколько раз танцевал в фильмах");

    }

}
