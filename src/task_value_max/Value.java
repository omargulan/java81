package task_value_max;

import java.util.Arrays;
import java.util.Objects;

public class Value {
    private String[] str;
    private int maxValue;
    private int count;
    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public Value(int maxValue) {
        this.maxValue = maxValue;
        this.str = new String[maxValue];
    }

    public void add(String str) {
           if (count<maxValue){
                this.str[count] = str;
                count++;
            }
            else{
                System.out.println("error : array is full");
            }
        //System.out.println(Arrays.toString(this.str));
    }


    public void print() {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        if (this.count != value.count){
            return false;
        }
        for(int i=0; i<count; i++) {
            if (!(this.str[i].equals(value.str[i]))){
                return false;
            }

        }
        return true;
    }

    @Override
    public int hashCode() {

        return Arrays.hashCode(str);
        //for (int i)
    }
}
