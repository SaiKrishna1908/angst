package com.advj.grammar.expressions;

/*
    TODO: EseqExp

    Sequence of Expressions containing statement and a expression
*/


import com.advj.grammar.Exp;
import com.advj.grammar.Stm;

public class EseqExp extends Exp{
    public Stm stm;
    public Exp exp;

    public EseqExp(Stm stm, Exp exp) {
        this.stm = stm;
        this.exp = exp;
    } 
}