package Abc;

import java.util.ArrayList;
import java.util.List;

public class Abc {
    public static void main(String[] args) {
        Contacts adam = new Contacts("Adam", "877798765421", "family");
        Contacts mike = new Contacts("Mike", "870012345658", "friends");
        Contacts sam = new Contacts("Sam", "870165456972", "college");
        Contacts tom = new Contacts("Tom", "870298875555", "family");
        Contacts kety = new Contacts("Kety", "870012345658", "friends");
        Contacts john = new Contacts("John", "870012345658", "friends");

        Phonebook phonebook = new Phonebook();
        phonebook.addContact(adam);
        phonebook.addContact(mike);
        phonebook.addContact(sam);
        phonebook.addContact(tom);
        phonebook.addContact(kety);
        phonebook.addContact(john);
        //phonebook.searchGroup();
        //phonebook.searchByGroup("family");
        for (Contacts contact : phonebook.searchByGroup("family")) {
            System.out.println(contact.getName()+" " + contact.getNumber());

        }




        //phonebook.searchByGroup("friends");

    }
}
