package com.advj.grammar.expression_list;

import com.advj.grammar.Exp;
import com.advj.grammar.ExpList;

/*
    TODO: PairExpList

    A pair of expressions where head is a expression and tail is a list of expressions

    example: 

    print(a,a-1,a-2);

    The expressions inside a,a-1,a-2 can be represented by a single Symbol ie PairExpList
*/
public class PairExpList extends ExpList {

    public Exp head;
    public ExpList tail;

    public PairExpList(Exp head, ExpList tail) {
        this.head = head;
        this.tail = tail;
    }
}