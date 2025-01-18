
package com.bloodbank.controller.algorithms;

import com.bloodbank.model.BloodModel;
import java.util.List;


/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class BinarySearch {
    /**
     * Searches for a donor by their full name in a sorted list using binary search.
     *
     * @param searchValue the name to search for
     * @param donorList the sorted list of donors
     * @param left the leftmost index of the search range
     * @param right the rightmost index of the search range
     * @return the BloodModel object if found, otherwise null
     */
    public static BloodModel searchByFullName(String searchValue, List<BloodModel> donorList, int left, int right) {
        if (right < left) {
            return null;
        }

        int mid = left + (right - left) / 2;
        String midName = donorList.get(mid).getFullName();

        if (searchValue.compareToIgnoreCase(midName) == 0) {
            return donorList.get(mid);
        } else if (searchValue.compareToIgnoreCase(midName) < 0) {
            return searchByFullName(searchValue, donorList, left, mid - 1);
        } else {
            return searchByFullName(searchValue, donorList, mid + 1, right);
        }
    }
    
}
