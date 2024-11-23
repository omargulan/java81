package my_list;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList implements MyList{

    private String[] values;
    private int size;
    private int count = 0;

    public MyArrayList() {
        this.values = new String[10];


    }

    @Override
    public void add(String value) {
        /*String[] afterFullValue  = new String[values.length*2];
        for (int i = 0; i < values.length; i++){
            afterFullValue[i]=values[i];
        }
        if (count == values.length){
            values=afterFullValue;
        }
        values[count++]=value;*/
        if (count == values.length) {
            String[] newArray = new String[values.length * 2];
            // Use Arrays.copy() to efficiently copy existing elements
            System.arraycopy(values, 0, newArray, 0, count);
            values = newArray;
        }
        values[count++] = value;
    }

    @Override
    public void add(int position, String value) {
        for (int i = count; i > position; i--) {
            values[i] = values[i - 1];
        }
        values[position] = value;
        count++;




    }

    @Override
    public void remove(int position) {
        for (int i = position; i < count - 1; i++) {
            values[i] = values[i + 1];
        }
        values[count - 1] = null; // Clear the last element
        count--;

    }

    @Override
    public String get(int position) {
        return this.values[position];
    }

    @Override
    public boolean contains(String value) {
        boolean result = false;
        for(int i = 0; i < count; i++){
            if(values[i].equals(value)){
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList value = (MyArrayList) o;
        if (this.count != value.count){
            return false;
        }

        for(int i=0; i<count; i++) {
            if (!Objects.equals(this.values[i], value.values[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int i = 0; i < count; i++) {
            if (values[i] != null) {
                result = 31 * result + values[i].hashCode();
            } else {
                result = 31 * result;
            }
        }
        return result;


    }

    @Override
    public String toString() {
        String tmp = "";

        for(int i = 0; i< count; i++){
            if(i==(count-1)){
                tmp=tmp+values[i];
            } else tmp=tmp+values[i]+", ";



        }
        return "["+ tmp+"]";
    }

    @Override
    public int indexOf(String value) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(this.values[i], value)) {
                return i;
            }

        }
        return -1;
    }
}
