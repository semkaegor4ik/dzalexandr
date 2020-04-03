package com.company;

import java.io.Serializable;

public class VideoCard implements Serializable {
    private final String name;

    public VideoCard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "name='" + name + '\'' +
                '}';
    }
}
