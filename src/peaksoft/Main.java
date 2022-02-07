package peaksoft;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Улан", "программист", "Ачык-Асман");
        programmer.coding();
        System.out.println(programmer);


        System.out.println("-----------------------------------------------------------------------");


        Dancer dancer = new Dancer("Алмаз", "танцор", "NoName");
        dancer.dancing();
        System.out.println(dancer);
        System.out.println("________________________________________________________________________");


        Singer singer = new Singer("Нургазы", "певец", "BackstreetBoys");

        singer.singing();
        singer.playGitar();
        System.out.println(singer);

    }
}
