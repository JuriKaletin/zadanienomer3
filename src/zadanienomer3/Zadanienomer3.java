package zadanienomer3;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author User
 */
public class Zadanienomer3 {

    private static double s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println(" |Enter your Name| ");
     Scanner scanner = new Scanner(System.in);
      String name = scanner.next();
    System.out.println(" |Enter your secondname| ");
     String secondname = scanner.next();
    System.out.println("|Enter the year of your birthday|");
     int year = scanner.nextInt();
    System.out.println("|Enter the month of your birthday|");
     String month = scanner.next();
    System.out.println("|Enter the day of your birthday|");
     int day = scanner.nextInt();
        System.out.println(name+" "+secondname+" was born on "+year+" "+month+" "+day+" ");
    
        
              
        
        
        
    }

}