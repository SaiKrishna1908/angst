package com.advj.grammar.statements;

import com.advj.grammar.Exp;
import com.advj.grammar.Stm;

/*
    Representing Assignment Statement
    int a = a + 2;
*/
class AssignmentStm extends Stm {

    final public String identifier;
    final public Exp exp;

    public AssignmentStm(String id, Exp exp) {
        this.identifier = id;
        this.exp = exp;
    }

}