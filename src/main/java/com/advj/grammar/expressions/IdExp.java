package com.advj.grammar.expressions;

import com.advj.grammar.Exp;

/*
    TODO: Are IdExp simple expressions that contain identifiers ?
*/
public class IdExp extends Exp {
    String id;
    public IdExp(String id) {
        this.id = id;
    }
}
