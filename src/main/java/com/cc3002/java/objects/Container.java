package com.cc3002.java.objects;

public class Container {
    private String variable;

    public Container(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public boolean checkSameVariable(String var) {
        return variable == var;
    }

    public boolean checkEqualVariable(String var) {
        return variable.equals(var);
    }
}
