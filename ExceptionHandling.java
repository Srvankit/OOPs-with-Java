

public class ExceptionHandling {
    int a=10;
    int b=0;
    void div(){
        int c;
        try{
            c= a/b;
        System.out.println("the division is "+c);
        }
        catch(Exception e){
            System.out.println("exception occured "+e.getMessage());// tells what the exact error is 
            System.out.println(e.hashCode()); // tells where the variable is stored
            System.out.println(e.getClass()); // tells the class
            System.out.println(e.getStackTrace()); // tells the root cause for the exception
        }
        finally{
            System.out.println("hi class"); // chahe except aaye ya na aaye, finally class ka element print hoga(even if we remove the catch class- the data in finally class will be executed)
        }
    }
    public static void main(String[] args) {
     ExceptionHandling e = new ExceptionHandling();
     e.div();   
    }
}

// in errors;-  java.lang is a package that contains fundamental functions and arithmeticException is a class


// excpetion is a class
// "try"  keyboard is used at the place of excemption
// 1. Checked Exception(compile time)
//      ==>file not found
//      ==>class not found
//      ==> EOF Exception
//2.  Unchecked exception(Runtime)
// -> Arithmetic expection
// -> Null Pointer expection
// -> Array indexed out of bound expection

// Syntax for try and catch method
//  try{
//      Line of code where the exception can come
//  }
//  catch(Exception e){
//  handle the exception --> code
//  }

// Multiplle catch
// Nested Try
// Custom Exception                 . Read all these four topic by yourself
// Throw and throws
