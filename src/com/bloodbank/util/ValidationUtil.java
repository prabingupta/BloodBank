
package com.bloodbank.util;

import java.util.regex.Pattern;

/**
 *
 * @author prabinkumargupta
 * LMU ID: 23048504
 */
public class ValidationUtil {
    
  
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern DONOR_ID_PATTERN = Pattern.compile("^[0-4]+$"); // Assuming numeric IDs
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^\\d{10}$"); // Assuming 10-digit contact numbers
    private static final Pattern BLOOD_GROUP_PATTERN = Pattern.compile("^(A|B|AB|O)[+-]$");
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s,.-]+$"); // Basic address validation
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,4}$");
    private static final Pattern GENDER_PATTERN = Pattern.compile("^(Male|Female|Other)$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the donor ID is numeric.
     *
     * @param donorId the donor ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidDonorId(String donorId) {
        return !isNullOrEmpty(donorId) && DONOR_ID_PATTERN.matcher(donorId).matches();
    }

    /**
     * Validates if the contact number has 10 digits.
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if the blood group is one of the accepted formats.
     *
     * @param bloodGroup the blood group to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBloodGroup(String bloodGroup) {
        return !isNullOrEmpty(bloodGroup) && BLOOD_GROUP_PATTERN.matcher(bloodGroup).matches();
    }

    /**
     * Validates if the address is properly formatted.
     *
     * @param address the address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAddress(String address) {
        return !isNullOrEmpty(address) && ADDRESS_PATTERN.matcher(address).matches();
    }

    /**
     * Validates if the email is in a valid format.
     *
     * @param email the email to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidEmail(String email) {
        return !isNullOrEmpty(email) && EMAIL_PATTERN.matcher(email).matches();
    }

    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 40;
    }

    /**
     * Validates if the gender is valid (Male, Female, or Other).
     *
     * @param gender the gender to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGender(String gender) {
        return !isNullOrEmpty(gender) && GENDER_PATTERN.matcher(gender).matches();
    }

    /**
     * Utility to parse and validate an age value.
     *
     * @param ageText the text representing age
     * @return true if valid, otherwise false
     */
    public static boolean validateAgeInput(String ageText) {
        try {
            short age = Short.parseShort(ageText.trim());
            return isValidAge(age);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
