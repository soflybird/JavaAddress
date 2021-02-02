package com.tts;

import java.util.ArrayList;
import java.util.List;

//this class is a utility class
//all properties will be static
public class AddressBook {

    // field: an ArrayList of generic type Entries

    private static List<Entry> entryList = new ArrayList<>();

    // methods: ways to manipulate the array list
    // add method

    public static void addEntry(Entry entry){
        entryList.add(entry);
        System.out.println(entry);
    }

    // to include delete, search ,print

}
