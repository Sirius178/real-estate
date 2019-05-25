package com.advertisements.entities.enums;

public enum Repairs {
    COSMETIC("Косметический"),
    EURO("Евро"),
    DESIGNER("Дизайнерский"),
    WITHOUT_REPAIR("Без ремонта");

    private String value;
    Repairs (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
