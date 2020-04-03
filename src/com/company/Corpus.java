package com.company;

import java.io.Serializable;

public class Corpus implements Serializable {
    private final String name;

    public Corpus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Corpus{" +
                "name='" + name + '\'' +
                '}';
    }
}
