package com.solvedkatas.java.solvedkatas;

import java.util.Arrays;

public class PaginationHelperTest {

    public static void main(final String[] args) {
        PaginationHelper helper = new PaginationHelper<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 16, 20), 9);
        System.out.println(String.format("Number of items: %d", helper.itemCount()));
        System.out.println(String.format("Number of pages: %d", helper.pageCount()));
        System.out.println(String.format("Number of items per page: %d", helper.pageItemCount(2)));
        System.out.println(String.format("Number of page for item: %d", helper.pageIndex(15)));
    }
}
