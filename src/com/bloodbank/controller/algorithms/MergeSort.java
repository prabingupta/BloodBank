
package com.bloodbank.controller.algorithms;

import com.bloodbank.model.BloodModel;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class MergeSort {
    // Sort by Age
    public List<BloodModel> mergeSortByAge(List<BloodModel> unsortedData, boolean isDesc) {
        if (unsortedData.size() <= 1) {
            return unsortedData;
        }

        // Split the list into two halves
        int mid = unsortedData.size() / 2;
        List<BloodModel> left = new ArrayList<>(unsortedData.subList(0, mid));
        List<BloodModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

        // Recursively sort both halves
        left = mergeSortByAge(left, isDesc);
        right = mergeSortByAge(right, isDesc);

        // Merge the sorted halves
        return mergeByAge(left, right, isDesc);
    }

    private List<BloodModel> mergeByAge(List<BloodModel> left, List<BloodModel> right, boolean isDesc) {
        List<BloodModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge elements from left and right based on age comparison
        while (i < left.size() && j < right.size()) {
            if (isDesc) {
                if (left.get(i).getAge() > right.get(j).getAge()) {
                    merged.add(left.get(i));
                    i++;
                } else {
                    merged.add(right.get(j));
                    j++;
                }
            } else {
                if (left.get(i).getAge() <= right.get(j).getAge()) {
                    merged.add(left.get(i));
                    i++;
                } else {
                    merged.add(right.get(j));
                    j++;
                }
            }
        }

        // Add any remaining elements from the left list
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        // Add any remaining elements from the right list
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
    
}
