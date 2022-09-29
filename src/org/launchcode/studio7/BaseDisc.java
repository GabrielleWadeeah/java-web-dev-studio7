package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {
    private String name;
    private int capacity;
  //private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, int capacity, ArrayList<String> contents, String discType){
        this.name = name;
        this.capacity = capacity;
      //this.contents = contents;
        this.discType = discType;
    }

    public BaseDisc(String name, int capacity, String discType) {
    }
}
