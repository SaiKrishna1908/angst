package com.advj;

import com.advj.grammar.Stm;
import com.advj.grammar.expression_list.LastExpList;
import com.advj.grammar.expression_list.PairExpList;
import com.advj.grammar.expressions.*;
import com.advj.grammar.expressions.OpExp.Operation;
import com.advj.grammar.statements.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            a := 5+3; b := (print(a, a-1), 10*a); print(b)
        */

        AssignmentStm assignA = new AssignmentStm("a", new OpExp(new NumExp(5), new NumExp(3), Operation.PLUS));
        
        Stm compStmt = new CompoundStm(
            new AssignmentStm("b",
             new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
             new LastExpList(new OpExp(new IdExp("a"),new NumExp(1), Operation.MINUS)
            ))), new OpExp(new NumExp(10), new IdExp("a"), Operation.TIMES))),
            new PrintStm(new LastExpList(new IdExp("b"))));
        
        
        Stm statement = new CompoundStm(assignA, compStmt); 
    }
}
