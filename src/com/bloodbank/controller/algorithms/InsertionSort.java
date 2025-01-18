
package com.bloodbank.controller.algorithms;

import com.bloodbank.model.BloodModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class InsertionSort {
     // Sort by Address
    public List<BloodModel> sortByAddress(List<BloodModel> unsortedData, boolean isDesc) {
        List<BloodModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 1; i < dataToSort.size(); i++) {
            BloodModel currentDonor = dataToSort.get(i);
            int j = i - 1;

            // Compare based on address
            while (j >= 0 && (isDesc ? dataToSort.get(j).getAddress().compareToIgnoreCase(currentDonor.getAddress()) < 0
                    : dataToSort.get(j).getAddress().compareToIgnoreCase(currentDonor.getAddress()) > 0)) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j = j - 1;
            }
            // Place the currentDonor at its correct position
            dataToSort.set(j + 1, currentDonor);
        }
        return dataToSort;
    }
}
