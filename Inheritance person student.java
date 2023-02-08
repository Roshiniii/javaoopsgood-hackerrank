import java.io.*;
import java.util.*;
 

class Person{
String firstName;
String lastName;
    
}

class Student extends Person{
    private int id;
    int n,sum=0;
    float avg=0;
    char grade;
    Student(String firstName,String lastName,int id, String[] scores){
        super.firstName = firstName;
        super.lastName = lastName;
        this.id = id;
        for(int i=0;i<scores.length;i++){
            sum += Integer.parseInt(scores[i]);
            n++;
        }
        
    }
    
    public void calculate(){
        System.out.println("Name: "+firstName+", "+lastName);
        System.out.println("ID: "+id);
         avg = sum/n;
        if( avg >= 90 && avg <= 100)
           grade = 'O';
        else if(avg >= 80 && avg < 90)
           grade = 'E';
        else if(avg >= 70 && avg < 80)
            grade = 'A';
        else if(avg >= 55 && avg < 70)
            grade = 'P';
        else if(avg >= 40 && avg < 55)
            grade = 'D';
        else
            grade = 'T';
        System.out.println("Grade: "+grade);
    }
}




public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int n = sc.nextInt();
        sc.nextLine();
        String [] scores = sc.nextLine().split(" ");
        Student obj = new Student(input[1],input[0],Integer.parseInt(input[2]),scores);
        obj.calculate();
    }
}
