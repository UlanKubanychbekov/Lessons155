package peaksoft;

public class Class {
    private int san;
    private String word;
    private int [] array;

    public Class(int san, String word, int[] array) {
        this.san = san;
        this.word = word;
        this.array = array;
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        for (int mas:array){
            System.out.print(mas+" ");

        }
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
