
package com.bloodbank.model;


/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class BloodModel {
    private int donorId;
    private String fullname;
    private short age;
    private String contact;
    private String bloodgroup;
    private String address;
    private String email;
    private String gender;
    
    public BloodModel(){
        
    }
    // Constructor of Blood Model
    public BloodModel(int donorId, String fullname, short age, String contact, 
            String bloodgroup, String address, String email, String gender){
        this.donorId = donorId;
        this.fullname = fullname;
        this.age = age;
        this.contact = contact;
        this.bloodgroup = bloodgroup;
        this.address = address;
        this.email = email;
        this.gender = gender;
        
    }
    
    public int getDonorId(){
        return donorId;
    }
    
    public void setDonorId(int donorId){
        this.donorId = donorId;
    }
    
    public String getFullName(){
        return fullname;
    }
    
    public void setFullName(String fullname){
        this.fullname = fullname;
    }
    
    public short getAge(){
        return age;
    }
    
    public void setAge(short age){
        this.age = age;
    }
    
    public String getContact(){
        return contact;
    }
    
    public void setContact(String contact){
        this.contact = contact;
    }
    
    public String getBloodGroup(){
        return bloodgroup;
    }
    
    public void setBloodGroup(String bloodgroup){
        this.bloodgroup = bloodgroup;
    }
    
     public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
     public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
     public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}
