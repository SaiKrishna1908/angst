package com.advj.grammar.expressions;

import com.advj.grammar.Exp;

/*
    A Numerical Constant
    a = 5;
    a is IdExp and 5 is NumExp
*/
public class NumExp extends Exp {
    public int num;

    public NumExp(int num) {
        this.num = num;
    }
}
