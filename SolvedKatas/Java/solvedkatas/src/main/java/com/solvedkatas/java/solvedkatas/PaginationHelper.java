package com.solvedkatas.java.solvedkatas;

import java.util.List;

public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return itemsPerPage >= collection.size() ? 1 : (collection.size() / itemsPerPage) + 1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int num = -1, pages = pageCount();

        if ((pageIndex + 1) <= pages && pageIndex > -1 && collection.size() > 0)
            if ((pageIndex + 1) == pages)
                num = (collection.size() % itemsPerPage);
             else
                num = itemsPerPage;

        return num;
    }

    /**
     * determines what page an item is on. Zero based indexes this method should
     * return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return itemIndex > (collection.size() - 1) || itemIndex < 0 ? -1
                : ((itemIndex + 1) / itemsPerPage);
    }
}
