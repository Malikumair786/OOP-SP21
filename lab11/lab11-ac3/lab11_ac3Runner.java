package com.company;

public class lab11_ac3Runner {
    public static void main(String[] args) {
        I1 i1 = new B1();
        i1.methodi1();
        System.out.println("K1");
//        i1.methodI2();            //throws an error bcz methodi2 is not in B1
        ((I2)i1).methodi2();
        System.out.println("K2");



        I2 i2 = new B1();
        System.out.println("K3");

        i2.methodi2();
        System.out.println("K4");

        i2.methodi1();
        System.out.println("K5");

//        String var = i1.methodA1();           not comparre
        String var2 = ((A1)i1).methodA1();
        System.out.println("Var2: "+var2);
        String var3 = ((B1)i1).methodA1();
        System.out.println("Var3: "+var3);
        String var4 = i1.toString();            //print tostring method of class A1
        System.out.println("Var4: "+var4);
        String var5 = i2.toString();            //print tostring method of class A1
        System.out.println("Var5: "+var5);

        I1 i3 = new C1();
        String var6 = i3.toString();
        System.out.println("var6: "+var6);

        Object o1 = new B1();
//        o1.methodi1();
        ((I1)o1).methodi1();
        ((I2)o1).methodi1();
        ((B1)o1).methodi1();

    }
}
