package com.company;

import java.io.Serializable;

public class Cooler implements Serializable {
    private final String name;

    public Cooler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cooler{" +
                "name='" + name + '\'' +
                '}';
    }
}
