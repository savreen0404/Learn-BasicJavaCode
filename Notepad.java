// Created By Rajanish Bhagat

import java.util.*;
import java.io.*;
 
class Notepad {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("gedit");
    }
    catch (IOException e) {
      System.out.println(e);
    }  
  }
}
