package com.cc3002.java.objects;

import java.util.Objects;

public class B extends A {

    public B() {
    }

    public B(int number) {
        super(number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B) {
            return ((B) obj).number == this.number;
        }
        return false;
    }
}
