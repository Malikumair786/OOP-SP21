package com.company;

class B1 extends A1 implements I2{
//    @Override
//    public String methodA1() {
//        return "I am in methodA1 of class B1";
//    }

    @Override
    public void methodi2() {
        System.out.println("I am in methodi2 of class B1");
    }

    @Override
    public void methodi1() {
        System.out.println("I am in methodi1 of class B1");
    }
}




class C1 implements I2{
    public void methodi1(){
        System.out.println("I am in methodI1 of class C1");
    }
    @Override
    public void methodi2() {
        System.out.println("I am in methodi2 of class C1");
    }
}




abstract class D1 implements I2{
    public void methodI1(){

    }

}
