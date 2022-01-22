package com.advj.grammar.statements;

import com.advj.grammar.ExpList;
import com.advj.grammar.Stm;

/*
    Print statements print((i+2+3+5));
*/
public class PrintStm extends Stm {
    public ExpList exps;
    public PrintStm(ExpList exps) {
        this.exps =exps;
    }
}
