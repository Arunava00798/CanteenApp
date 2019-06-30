package com.example.arunava.canteen1;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueRandomNumbers {



    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<11; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);


    }
}
