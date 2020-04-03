package com.company;

import java.io.Serializable;

public class MotherPlate implements Serializable {
    private final String name;

    public MotherPlate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MotherPlate{" +
                "name='" + name + '\'' +
                '}';
    }
}
