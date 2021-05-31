package com.company;


public class HumanResource  {
    Person s;
    HumanResource(String name,String id,String type){
        if (type.equals("Student")){
            s  = new Student(name,id);
        }
        else if (type.equals("Teacher")){
            s = new Teacher(name,id);
        }

        if (s instanceof Student){
            ((Student)s).associate();
        }
        else if (s instanceof Teacher){
            ((Teacher)s).associate();
        }
    }

    @Override
    public String toString() {
        return  s.toString()+"\n";
    }

//    public Person[] resource;
//    public static int index = -1;                           //-1 is bcz array index start with 0
//    public void add(String name,String id,String type) {
//        if (index == -1){                                 //first index
//            resources = new Person[1];
//            index++;
//        }
//        else {
//            extend();                                     //call the private method
//            index++;
//        }

//        if (type.equals("Student")){                          //thord argument of add method
//            resources[index] = new Student(name,id);          //instantiate
//        }
//        else if (type.equals("Teacher")){
//            resources[index] = new Teacher(name,id);
//        }
//
//        if (resources[index] instanceof Student){
//            ((Student)resources[index]).associate();              //typeCasting
//        }
//        else if (type.equals("Teacher")){
//            ((Teacher)resources[index]).associate();
//        }
//
//    }

//    private void extend(){
//        Person[] arr = new Person[index+2];                   //instantiate an array whose type is also same as resources array
//        for (int i = 0 ; i<=index ; i++){                     //index+2 is bcz if index = 0  then the arr length is 0+2=2 means only index0 and 1
//               arr[i] = resources[i];                         //and 0 index is already use in the add method if condition
//        }                                                     //then copy content of original array
//        resources = arr;
//    }

//    @Override
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i <= resources.length-1 ; i++){
//            s.append(resources[i]).append("\n");
//        }
//        return s.toString();
//    }

//    public void delete(String id){                        //id is special forevery single person
//        Person[] newarr = new Person[index];              //instantiate an array whose type is also same as resorces array
//        boolean b = false;
//        int j = 0;
//        for (int i = 0 ; i<resources.length; i++){
//            if (resources[i].getId().equals(id)){                 //getid() is in the person class
//                b = true;
//                continue;
//            }
//            if (j < resources.length-1) {
//                newarr[j] = resources[i];                         //condition for coppying the content of array
//                j++;
//            }
//        }
//        if (b){
//            index--;                                  //bcz if we remove 1 index, then the lenth is also decrease
//            b = false;
//        }
//        else {
//            System.out.println("The "+id+" id is not present in the array");  //if the id don't match with the id in the record
//        }
//        resources = newarr;
//    }
}