package my_list;

public interface MyList {

    void add(String value);

    void add(int position, String value);

    void remove(int position);

    String get (int position);

    boolean contains(String value);

    int indexOf(String value);

    int size();


}
