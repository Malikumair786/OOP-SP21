package com.company;

public class commissionEmployee {
    protected String firstName;
    protected String lastName;
    protected String SSN;
    protected double grossSale;
    protected double commissionRate;

    commissionEmployee(){
        firstName = "Nagina";
        lastName = "Nazar";
        SSN = "S003";
        grossSale = 123.1;
        commissionRate = 12.5;
    }
    commissionEmployee(String firstName,String lastName,String SSN,double grossSale,double commissionRate){
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
        this.SSN = SSN;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSSN() { return SSN; }

    public void setSSN(String SSN) { this.SSN = SSN; }

    public double getGrossSale() { return grossSale; }

    public void setGrossSale(double grossSale) { this.grossSale = grossSale; }

    public double getCommissionRate() { return commissionRate; }

    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    public double earning(){
        return grossSale*commissionRate;
    }

    public void display(){
        System.out.print("First name: "+firstName+", last name: "+lastName+", SSN: "+SSN+", gross sale: "+grossSale+", Common rate: "+commissionRate);
    }
}
