package oop2;

public class ArrayTask {
    private int array[];
    private int arrayInClone[];

    public int[] getArray() {
        return this.arrayInClone;
    }

    public void setArray(int[] array) {
        arrayInClone =this.array;
    }
}
