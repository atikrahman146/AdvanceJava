/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Nov04_XML;

/**
 *
 * @author J2EE-33
 */
public class NewClass {

    public static void main(String[] args) {

        String Str = new String("10");
        System.out.println("Hashcode for Str :" + Str.hashCode());

        int x = 10;
        int y = 10;

        Integer x1 = new Integer(10);
        Integer y1 = new Integer(10);

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

        System.out.println(System.identityHashCode(x1));
        System.out.println(System.identityHashCode(y1));
        
        System.out.println(x1.hashCode());

        System.out.println(x == y);
        System.out.println(x1 == y1);

    }
}
