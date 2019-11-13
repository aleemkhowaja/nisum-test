package com.persona.information.enums;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum HairColorEnum {
    BLACK(1, "BLACK"),
    RED(2, "RED"),
    YELLOW(3, "YELLOW"),
    BROWN(4, "BROWN"),
    WHITE(5, "WHITE");


    private int id;
    private String message;

    HairColorEnum(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    @JsonValue
    public String getMessage() {
        return message;
    }

    @JsonCreator
    public static HairColorEnum fromText(String text) {
        try {
            return valueOf(text);
        } catch (Exception e) {
            return null;
        }
    }

    @JsonCreator
    public static List<HairColorEnum> getList() {
        try {
            List<HairColorEnum> list = Arrays.asList(values());
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}