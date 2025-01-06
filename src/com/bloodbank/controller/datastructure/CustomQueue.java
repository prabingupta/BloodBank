
package com.bloodbank.controller.datastructure;

import com.bloodbank.model.BloodModel;
import java.util.LinkedList;


/**
 * * <b>Custom implementation of a queue data structure for managing DonorModel
 * objects. This queue is implemented using a LinkedList and supports basic
 * operations like enqueue, dequeue, peek, and size checks</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Capacity limit for the queue.</li>
 * <li>Ability to check if the queue is empty or full.</li>
 * </ul>
 *
 * <p>
 * Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class CustomQueue {
    
    private LinkedList<BloodModel> vivaList; //Internal Storage for queue.
    private int capacity;
    
    /**
     * Constructs a CustomQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is negative.
     */
    
    public CustomQueue(int capacity) {
        if (capacity <=0) {
            throw new IllegalArgumentException("Capacity should be greater than zero.");
        }
        vivaList = new LinkedList<>();
        this.capacity = capacity;
    }
    
    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first DonorModel in the queue, or null if the queue is
     * empty.
     * @throws IllegalStateException if the queue is empty.
     */
    
    public BloodModel deQueue() {
        try{
            return vivaList.removeFirst();
            
        }catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from empty queue."); // Shows that the queue is full
        }
    }






     /**
     * Adds a new element to the end of the queue if it is not full.
     *
     * @param bloodModel the bloodModel to be added to the queue.
     * @return the current size of the queue after the operation , or -1 if the
     * queue is full.
     */

     public int enQueue(BloodModel bloodModel){
          if (isFull ()) {
              throw new IllegalStateException("Cannot peek into an empty queue."); // Indicates the queue is full
     }
      vivaList.addLast(bloodModel);
      return vivaList.size();
     }
     
     /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
     
     public int poll() {
        return vivaList.size();
    }
     
     /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first StudentModel in the queue, or null if the queue is
     * empty.
     * @throws IllegalStateException if the queue is empty.
     */
    public BloodModel peek() {
        try{
            return vivaList.getFirst();
        }catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
    }
    
    
     /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return vivaList.isEmpty();
    }
     
     
     
    
     
     /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return vivaList.size() == capacity;
    }
     }

   