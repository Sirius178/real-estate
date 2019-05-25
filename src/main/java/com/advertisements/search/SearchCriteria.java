package com.advertisements.search;

import com.advertisements.entities.enums.Commercial;
import com.advertisements.entities.enums.Living;
import com.advertisements.entities.enums.NumberOfRooms;

public class SearchCriteria {

    private SearchType searchType;
    private Commercial commercial;
    private Living living;
    private NumberOfRooms numberOfRooms;
    private int minPrice;
    private int maxPrice;

    SearchCriteria(){}

    public SearchCriteria(SearchType searchType, Commercial commercial, int minPrice, int maxPrice) {
        this.searchType = searchType;
        this.commercial = commercial;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public SearchCriteria(SearchType searchType, Living living, NumberOfRooms numberOfRooms, int minPrice, int maxPrice) {
        this.searchType = searchType;
        this.living = living;
        this.numberOfRooms = numberOfRooms;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public Living getLiving() {
        return living;
    }

    public void setLiving(Living living) {
        this.living = living;
    }

    public NumberOfRooms getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(NumberOfRooms numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }
}
