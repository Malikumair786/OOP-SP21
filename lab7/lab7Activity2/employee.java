package com.company;

public class employee {
    private Date birthDate;
    private Date hireDate;
    private String name;
    private String fName;

    public employee(String name,String fName,Date hireDate,Date birthDate){
        this.name = name;
        this.fName = fName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public Date getHireDate() { return hireDate; }

    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getfName() { return fName; }

    public void setfName(String fName) { this.fName = fName; }

    public void display(){
        System.out.println("name: "+name);
        System.out.println("father name: "+fName);
        birthDate.display();
        hireDate.display();
    }
}
