package com.company;

public class student extends person{
    private String rollno;
    private int marks;
    public student(){
        super();            //may or may not be written
        rollno = "096";
        marks = 456;
    }
    public student (String a,String b,int c,String d,int e){
        super(a,b,c);
        rollno = d;
        marks = e;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display(){
        super.display();
        System.out.println("Roll no: "+rollno+"\nMarks "+marks);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "rollno='" + rollno + '\'' +
                ", marks=" + marks;
    }
}
