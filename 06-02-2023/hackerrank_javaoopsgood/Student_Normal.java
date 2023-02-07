import java.io.*;
import java.util.*;
class Student {
    private String name;
    private int rollNo;
    private String branch;
    private int year;
    private List<Integer> marks;
    private static int noOfStudents = 0;  
    public Student(String name, int rollNo, String branch, int year){
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
        marks = new ArrayList<>();
        noOfStudents++;
    }   
    public String getName(){
        return name;
    }   
    public int getRollNo(){
        return rollNo;
    }  
    public String getBranch(){
        return branch;
    }   
    public int getYear(){
        return year;
    }    
    public static int getNoOfStudents(){
        return noOfStudents;
    }   
    public void addMark (int mark){
        marks.add(mark);
    }  
    public void display(){
        System.out.println(rollNo+" "+name+" "+branch+" "+year);
    }
    public double computePercentage(){
        if(marks.size() == 0)
            return 0;
        double sum = 0;
        for(Integer mark: marks)
            sum += mark;
        return (sum/marks.size());
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String[] input = sc.nextLine().split(" ");
            Student s = new Student(input[0],Integer.parseInt(input[1]),input[2],Integer.parseInt(input[3]));
            String[] marks = sc.nextLine().split(" ");
            for(String m: marks)
                s.addMark(Integer.parseInt(m));
            s.display();
            System.out.printf(s.getRollNo()+" "+"%.2f\n",s.computePercentage());
        }
        System.out.println("NoOfStudents="+Student.getNoOfStudents());
        
    }
}
