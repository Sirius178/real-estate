package com.advertisements.search;

public enum SearchType {
    BUY("Купить"),
    longTermRent("Арендовать"),
    byTheDay ("Посуточно");

    private String value;
    SearchType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
