package main;

import definition.SinglyLinkedList;
import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        SinglyLinkedList<Person> list = new SinglyLinkedList<>();
        boolean flag = true;
        /*do {
            System.out.println("Welcome to Krishna gupta's contact list app\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addContact(list,list1,list2);
                    break;
                case 2:
                    list.sort();
                    list.print();
                    break;
                case 3:
                    /


            }
        }while ();

    }*/
    }

    public static SinglyLinkedList addContact(SinglyLinkedList list, ArrayList list1, ArrayList list2) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        String s;
        System.out.println("You have chosen to add a new contact:\n" +
                "please enter the name of person\n" +
                "first name:");
        String fname = scanner.nextLine();
        person.setFname(fname);
        list2.add(fname);
        System.out.println("Last name:");
        String lname = scanner.nextLine();
        person.setLname(lname);
        list1.add(fname + " " + lname);
        System.out.println("contact number:");
        long phonenumber = scanner.nextLong();
        person.setPhonenumber(phonenumber);
        scanner.nextLine();
        do {
            System.out.print("Would you like to add another contact number?(y/n):");
            s = scanner.next();
            if (s.equalsIgnoreCase("y")) {
                System.out.print("Contact number:");
                long phonenumber1 = scanner.nextLong();
                person.setPhonenumber(phonenumber1);
            }
        } while (s.equalsIgnoreCase("y"));
        scanner.nextLine();
        System.out.print("Would you like to add email address? (y/n):");
        s = scanner.next();
        scanner.nextLine();
        if (s.equalsIgnoreCase("y")) {
            System.out.print("email address:");
            String email = scanner.nextLine();
            person.setEmail(email);
        }
        list.add(person);
        Collections.sort(list1);
        Collections.sort(list2);
        return list;
    }

    public static SinglyLinkedList removeContact(SinglyLinkedList list, ArrayList list1, ArrayList list2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("All contacts are here:");
        int k = 1;
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + 1 + "." + list1.get(i));
            k++;
        }
        System.out.println("Press the number against the contact to delete it:");
        int i = scanner.nextInt();
        list.remove(i);
        System.out.println(list1.get(i - 1) + "'s contact deleted from list!");
        list1.remove(i - 1);
        list2.remove(i - 1);
        return list;

    }

    public static SinglyLinkedList searchContact(SinglyLinkedList list, ArrayList list2) {
        System.out.println("you could search for a contact for their first names:");
        Scanner scanner = new Scanner(System.in);
        String fname = scanner.nextLine();
        int k = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (fname.equals(list2.get(i))) {
                k++;
            }
        }
        if (k == 0) {
            System.out.println("No results found!");
        } else {
            System.out.println(k + "match found!");
            for (int i = 0; i < list2.size(); i++) {
                if (fname.equals(list2.get(i))) {
                    list.print(i + 1);
                }
            }
        }
        return list;
    }


}

