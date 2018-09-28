package com.cc3002.java.objects;

public class ObjectHolder {
    private Object variable;

    public ObjectHolder(Object variable) {
        this.variable = variable;
    }

    public Object getVariable() {
        return variable;
    }

    public boolean checkSameReference(Object var) {
        return variable == var;
    }

    public boolean checkEqualVariable(Object var) {
        return variable.equals(var);
    }
}
