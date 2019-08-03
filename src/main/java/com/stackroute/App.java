package com.stackroute;


import com.stackroute.domian.*;


public class App
{
    public static void main( String[] args )
    {int[] test={10,20,30};
    String[] test1={"anil","AnilK","@nilKumar"};
    int[][] test2={{2,9,8},{3,33,32},{21,9,57}};
        ConditionalStatementsAndLoops conditionalStatementsAndLoops=new ConditionalStatementsAndLoops();
        conditionalStatementsAndLoops.conditionalStatementIfElse(10);
        conditionalStatementsAndLoops.conditionalStatementSwitch(2);
        conditionalStatementsAndLoops.javaLoops(test);

        Arrays arrays=new Arrays();
        arrays.intArray(test);
        arrays.stringArray(test1);
        arrays.multiDimensionalArray(test2);

        VitaraBrezza vitaraBrezza =new VitaraBrezza("black",500000.90f);
        vitaraBrezza.chagingGear();
        vitaraBrezza.speed();
        vitaraBrezza.steering();



////        implementing of lambda expression
//
//        new Thread(()->{
//            System.out.println("Lambda");
//            System.out.println("Another Lambda");
//            System.out.println("Lambda2");
//        }
//        ).start();
//        Interface anInterface = ()->System.out.println("this is lambda expression");
//        // This calls above lambda expression and prints.
//        anInterface.accessLambda();



        NestedClass nestedClass =new NestedClass();
        NestedClass.InnerClass myInner = nestedClass.new InnerClass();

        NestedClass.InnerClass.Nested nested=myInner.new Nested();
        nested.show();

        ConstructorAndThisKeyWordImplementation constructorAndThisKeyWordImplementation =new ConstructorAndThisKeyWordImplementation();
        constructorAndThisKeyWordImplementation.setName("Anil");
        constructorAndThisKeyWordImplementation.setAge(23);
        constructorAndThisKeyWordImplementation.setId(1);
        System.out.println(constructorAndThisKeyWordImplementation.getName()+"\n"+ constructorAndThisKeyWordImplementation.getAge()+"\n"+ constructorAndThisKeyWordImplementation.getId());

        CustomExceptionImplementation customExceptionImplementation=new CustomExceptionImplementation();
        try {
            customExceptionImplementation.exceptionImplementation(1);
        }catch (CustomException ex){
            System.out.println(ex.getMessage());
        }
    }
}
