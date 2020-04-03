package com.company;

import java.io.Serializable;

public class CPU implements Serializable,Comparable<CPU> {
    private final String name;
    private final int frequency;

    public CPU(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }

    @Override
    public int compareTo(CPU o) {
        if(this.frequency == o.frequency)
            return 0;
        if(this.frequency > o.frequency)
            return 1;
        else
            return -1;
    }
}
