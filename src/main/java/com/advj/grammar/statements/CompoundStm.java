package com.advj.grammar.statements;

import com.advj.grammar.Stm;

/*
    Class representing a compound statement
    Stm -> stm1;
    
*/
class CompoundStm extends Stm{
    public Stm stm1;
    public Stm stm2;

    public CompoundStm(Stm st1, Stm st2) {
        this.stm1 = st1;
        this.stm2 = st2;
    }
}   