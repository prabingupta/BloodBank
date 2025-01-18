
package com.bloodbank.controller.algorithms;

import com.bloodbank.model.BloodModel;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class SelectionSort {
    public List<BloodModel> sortByDonorId(List<BloodModel> unsortedData, boolean isDesc) {
        
        List<BloodModel> sortingData = new ArrayList(); 
        sortingData.addAll(unsortedData);
        
        for (int i = 0; i < sortingData.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < sortingData.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (sortingData.get(j).getDonorId() > sortingData.get(minIndex).getDonorId()) {
                        minIndex = j;
                    }
                } else {
                    if (sortingData.get(j).getDonorId() < sortingData.get(minIndex).getDonorId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            BloodModel tempDonor = sortingData.get(minIndex);
            sortingData.set(minIndex, sortingData.get(i));
            sortingData.set(i, tempDonor);
        }
        return sortingData;
    }
    
}