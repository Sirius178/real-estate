package com.advertisements.search;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    private Map<String, SearchType> searchTypeList = new HashMap<>();
    private SearchType selectedSearchType = SearchType.BUY;
    private String searchString;

    public Map<String, SearchType> getSearchTypeList(){
        searchTypeList.clear();
        searchTypeList.put("SELL",SearchType.BUY);
        searchTypeList.put("longTermRent",SearchType.longTermRent);
        searchTypeList.put("byTheDay",SearchType.byTheDay);
        return searchTypeList;
    }
}
