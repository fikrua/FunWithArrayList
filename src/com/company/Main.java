package com.company;
import java.util.Scanner;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> color = new ArrayList<String>();
        color.add ("red");
        color.add("blu");
        color.add("green");
        color.add(1,"yellow");
        color.set(1,"fikru");
        while(!done) {
            System.out.println("enter your favirote color");
            String colore1 = scan.nextLine();
            color.add(colore1);
            System.out.println("if you want stop adding color just push q");
            String yes = scan.nextLine();
            if(yes.equalsIgnoreCase("q"))
                done =true;
            else
                done = false;

        }
        String str = color.get(2);
        System.out.println(str);
        for(String co:color)
            System.out.print(co+ " ");

    }
}
