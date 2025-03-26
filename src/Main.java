import services.*;

import java.util.ArrayList;

public class Main {

    // Datatypes  -primitive ,user defined datatype

      // byte - 8 bit
      // short -16 bit
      // int -32 bit
      // long - 64 bit
      // float 32 bit
      // double 64 bit
      // char 16 bit
      // boolean 1 bit

// three kinds of functions that exis

 // static method
 // instance method or object methods
 // Constructor method

     public  int add(int a ,int b){  // instance methods
         return a+b;
     }

      public  static int subtract(int a ,int b){  // instance methods
          return a+b;
      }


    public static void main(String[] args) {  // static means relevant to class or belonging to a class
//        // instead of object
////        int v=-8;
////        short i=9;
////        boolean b=true;
////        char c='a';
////
////        System.out.println(v);
//      Main obj=new Main();  // Main() -->constructor function
//        int c=obj.add(8,9);
//        System.out.println(c);
//
//       /// Main.subtract(8,9);
//        obj.subtract(8,9);
//
//        // Bringin the Data class
//
//        Data data =new Data();
//        data.printDat();
//
//        // Trying to access the Vehicle class
//
////        Vehicle vehicle=new Vehicle();
////        vehicle.printVehicle();

        Animal human=new Animal();
        human.eyes=2;
        human.color="red";
        human.hands=2;
        System.out.println(human.color);

        int c=9;
        System.out.println(c);

//        Main mn=new Main();
//        mn.add(90,90);
//        add(90,90);

        // how arrays are created
        int[] ce= new int[6];  // stack = heap
        for (int i=0;i< ce.length;i++){
            System.out.println(ce[i]);

        }

        //String[] ceu={"hsjs","ksksk","sss"};
        ArrayList<Integer> arrayList=new ArrayList<>();

    }


}

class User{
    public  static int subtract(int a ,int b){
        // instance methods
      //  Main main=new Main();
//        Main.main([]);
        return a+b;
    }

}

