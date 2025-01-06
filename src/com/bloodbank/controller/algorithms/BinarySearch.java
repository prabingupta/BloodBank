
package com.bloodbank.controller.algorithms;

import com.bloodbank.model.BloodModel;
import java.util.List;


/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class BinarySearch {
    public BloodModel searchByFullName(String searchValue, List<BloodModel> donorList, int left, int right) {
        
        //Base Case
        if(right < left) {
            return null;
        }
        
        // mid value 
        int mid = (left + right) / 2 ;
        
        // check either serachkey lies on midpoint
        if(searchValue.compareToIgnoreCase(donorList.get(mid).getFullName()) == 0) {
            return donorList.get(mid);
            
        
       } else if (searchValue.compareToIgnoreCase(donorList.get(mid).getFullName()) < 0){
           return searchByFullName(searchValue, donorList, left, mid - 1);
        
       }else {
           return searchByFullName(searchValue, donorList, mid + 1, right);
       }
     } 
    
}
