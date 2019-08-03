package com.stackroute;


import com.stackroute.domian.Arrays;
import com.stackroute.domian.ConditionalStatementsAndLoops;

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
    }
}
