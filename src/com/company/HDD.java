package com.company;

import java.io.Serializable;

public class HDD implements Serializable {
    private final int memory;

    public HDD(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "memory=" + memory +
                '}';
    }
}
