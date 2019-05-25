package com.advertisements.entities.enums;

public enum RealEstateType {
    LIVING ("Жилая"),
    COMMERCIAL ("Коммерческая");

    private String value;
    RealEstateType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
