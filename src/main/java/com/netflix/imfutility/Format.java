package com.netflix.imfutility;

/**
 * Created by Alexander on 4/22/2016.
 */
public enum Format {

    DPP("dpp");

    private final String name;

    Format(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
