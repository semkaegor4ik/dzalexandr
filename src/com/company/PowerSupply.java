package com.company;

import java.io.Serializable;

public class PowerSupply implements Serializable {
    private final String name;
    private final int power;

    public PowerSupply(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
