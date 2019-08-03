package com.stackroute.domian;

//Class for Examples ofConditionalStatements and Loops in Java
public class ConditionalStatementsAndLoops {
//      IfElse Conditional Statement
    public void conditionalStatementIfElse(int x){
        if(x==0){
            System.out.println("given Number is zero(ifelse)");
        }
        else if (x>0){
            System.out.println("given number is positive");
        } else System.out.println("given number is negative");
    }

//      Switch Conditional Statement
    public void conditionalStatementSwitch(int x) {
        switch (x) {
            case 0:
                System.out.println("given number is zero (from switch)");
                break;
            case 1:
                System.out.println("given number is 1(from switch)");
                break;
            default:
                System.out.println("given number doesnot matches any of the conditions from switch");
        }
    }

//        JavaLoops like for loop,do while loop and modifiedForLoop
        public void javaLoops(int[] numbers) {
        int i=0;
            System.out.println("while loop");
        do {
            System.out.println(numbers[i]);
            i++;
        }while (i<numbers.length);

            System.out.println("forloop");
          for ( int j=0;j<numbers.length;j++){
              numbers[j] += 1;
              System.out.println(numbers[j]);
          }
            System.out.println("foreachloop");
            for (int s:numbers) {
                s=s+3;
                System.out.println(s);
            }


        }
    }

