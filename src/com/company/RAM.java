package com.company;

import java.io.Serializable;

public class RAM implements Serializable,Comparable<RAM> {
    private final int memory;

    public RAM(int ram) {
        this.memory = ram;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "memory=" + memory +
                '}';
    }

    @Override
    public int compareTo(RAM o) {
        if(this.memory == o.memory)
            return 0;
        if(this.memory > o.memory)
            return 1;
        else
            return -1;
    }
}
