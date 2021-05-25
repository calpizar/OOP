package com.ucreativa;

import com.ucreativa.familia.Carmen;
import com.ucreativa.familia.Xinia;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Carmen one = new Carmen();

	    System.out.println("Hello World");

	    Xinia two = new Xinia("Hola");

	    two.setAge();
	    int age =two.getAge();
        System.out.println("My Age is: " + age);
        System.out.println("My hobby is : "  + two.getHobby());
    }
}
