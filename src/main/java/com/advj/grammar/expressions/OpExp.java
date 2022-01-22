package com.advj.grammar.expressions;

import com.advj.grammar.Exp;

/*
    A Operation Expression

    Contains 
    1. left expression
    2. right expression
    3. Operand

    Occurence

    (left_exp) (operand) (right_exp)
*/
public class OpExp extends Exp {
    
    public Exp leftExp;
    public Exp rightExp;
    public int operand;

    public enum Operation{
        PLUS(1),
        MINUS(2),
        TIMES(3),
        DIV(4);

        int value;

        Operation(int value) {
            this.value = value;
        }
    }

    public OpExp(Exp leftExp, Exp rightExp, int operand) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operand = operand;
    }

    public OpExp(Exp lExp, Exp rExp, Operation operation) {
        this(lExp, rExp, operation.value);
    }
    
}
