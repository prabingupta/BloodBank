
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
        
        List<BloodModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getDonorId() > dataToSort.get(minIndex).getDonorId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getDonorId() < dataToSort.get(minIndex).getDonorId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            BloodModel tempDonor = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempDonor);
        }
        return dataToSort;
    }
    
     public List<BloodModel> sortByFullName(List<BloodModel> unsortedData, boolean isDesc) {
        
        List<BloodModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getFullName().compareToIgnoreCase(dataToSort.get(minIndex).getFullName())>0 ) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getFullName().compareToIgnoreCase(dataToSort.get(minIndex).getFullName())<0) {
                        minIndex = j;
                    }
                }
            }
            //swap
            BloodModel tempDonor = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempDonor);
        }
        return dataToSort;
    }

}