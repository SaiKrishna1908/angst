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

    public enum OPERATION{
        PLUS(1),
        MINUX(2),
        TIMES(3),
        DIV(4);

        int value;

        OPERATION(int value) {
            this.value = value;
        }
    }

    public OpExp(Exp leftExp, Exp rightExp, int operand) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
        this.operand = operand;
    }

    public OpExp(Exp lExp, Exp rExp, OPERATION operation) {
        this(lExp, rExp, operation.value);
    }
    
}
