package Model;

public class Element {
    private int size;
    private int [] array;

    public Element() {
    }

    public Element(int size, int[] array) {
        this.size = size;
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
}
