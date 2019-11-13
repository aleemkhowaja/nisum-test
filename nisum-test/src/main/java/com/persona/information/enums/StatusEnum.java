package com.persona.information.enums;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusEnum {
	ACTIVE(1, "ACTIVE"),
	DELETED(2, "DELETED");


    private Integer status;
    private String description;

    StatusEnum(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    @JsonValue
    public String getDesription() {
        return description;
    }

    @JsonCreator
    public static StatusEnum fromText(String text) {
        try {
            return valueOf(text);
        } catch (Exception e) {
            return null;
        }
    }

    @JsonCreator
    public static List<StatusEnum> getList() {
        try {
            List<StatusEnum> list = Arrays.asList(values());
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}