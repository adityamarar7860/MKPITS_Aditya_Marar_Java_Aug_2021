/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Student{
    String name;
    int rollno;
}
public class TestEx2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="john";
        s.rollno=2;
        System.out.println("name ="+s.name);
        System.out.println("roll no="+s.rollno);
    }
}