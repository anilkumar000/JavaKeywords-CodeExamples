package com.stackroute;


import com.stackroute.domian.ConditionalStatementsAndLoops;

public class App
{
    public static void main( String[] args )
    {int[] test={10,20,30};
        ConditionalStatementsAndLoops conditionalStatementsAndLoops=new ConditionalStatementsAndLoops();
        conditionalStatementsAndLoops.conditionalStatementIfElse(10);
        conditionalStatementsAndLoops.conditionalStatementSwitch(2);
        conditionalStatementsAndLoops.javaLoops(test);
    }
}
