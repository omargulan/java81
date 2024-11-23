package Abc;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contacts> contactsList = new ArrayList<>();

    void addContact(Contacts contact){

        boolean isDuplicate = false;

        for (Contacts existingContact : contactsList) {
            if (existingContact.getName().equals(contact.getName()) ||
                    existingContact.getNumber().equals(contact.getNumber())) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {
            contactsList.add(contact);

        } else {
            System.out.println("Найден дубль, не добавлен: " + contact.getName());
        }
    }

    public void searchGroup (){
        for (int i = 0; i< contactsList.size(); i++){
            System.out.println(contactsList.get(i).getGroup()+" " +contactsList.get(i).getName() + " " +contactsList.get(i).getNumber());
        }
    }

//    public void searchByGroup (String searchGroup){
//       for (int i = 0; i< contactsList.size(); i++){
//           if(contactsList.get(i).getGroup().equals(searchGroup)){
//                System.out.println(contactsList.get(i).getName() + " " +contactsList.get(i).getNumber());
//            }
//        }
//
//   }
//
    public List<Contacts> searchByGroup(String searchGroup) {
        List<Contacts> contactsFounded = new ArrayList<>();
        for (Contacts contact : contactsList) {
            if (contact.getGroup().equals(searchGroup)) {
                contactsFounded.add(contact);
            }
        }
        return contactsFounded;
}


}
