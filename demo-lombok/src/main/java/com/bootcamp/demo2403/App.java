package com.bootcamp.demo2403; //similar to sub-folder, group id

import java.util.ArrayList;
import java.util.List;

//import XXXXXX.util Arraylist;

//create Java Project -> JDK (java.lang) 唔夠用DL其他library
//but you need import java.util (因為自己帶有)

//Command "mvn comile" -> check dependency in pom.xml -> download dependency
//Java Project = JDK+juniy +lombok
//target folder -> generated main + test class files (similar to javac)

//command "mvn clean" ->clear target folder

//command "mvn clean compile" -> clear target folder, check dependency, comile 

// command "mvn clean install"

/**
 * Hello world!
 *
 */

 public class App {
    public static void main(String[] args) {
      System.out.println("Hello World!");
  
      StringBuilder sb = new StringBuilder();
      int x = (int) Math.pow(2.0, 2.0);
      
      Cat cat = new Cat("Vincent", 13);
      List<String> s = new ArrayList<>();
  
    }
  }