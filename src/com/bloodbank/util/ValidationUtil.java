
package com.bloodbank.util;

import java.util.regex.Pattern;

/**
 * Utility class for validating input text fields.
 * 
 * @author Prabin Kumar Gupta
 * LMU ID: 23048504
 */
public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Allows alphabets and spaces
    private static final Pattern DONOR_ID_PATTERN = Pattern.compile("^\\d{4}$"); // Ensures exactly 4-digit numeric IDs
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$"); // Nepal-specific 10-digit numbers starting with 98
    private static final Pattern BLOOD_GROUP_PATTERN = Pattern.compile("^(A|B|AB|O)[+-]$"); // Valid blood groups with +/-
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s,.-]+$"); // Basic address validation
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,4}$"); // Email validation
    private static final Pattern GENDER_PATTERN = Pattern.compile("^(Male|Female|Other)$"); // Valid gender options

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
     * Validates if the donor ID is a 4-digit numeric value.
     *
     * @param donorId the donor ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidDonorId(String donorId) {
        return !isNullOrEmpty(donorId) && DONOR_ID_PATTERN.matcher(donorId).matches();
    }

    /**
     * Validates if the contact number has 10 digits and starts with 98 (Nepal-specific).
     *
     * @param contact the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if the blood group is one of the accepted formats (A+, A-, B+, etc.).
     *
     * @param bloodGroup the blood group to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBloodGroup(String bloodGroup) {
        return !isNullOrEmpty(bloodGroup) && BLOOD_GROUP_PATTERN.matcher(bloodGroup).matches();
    }

    /**
     * Validates if the address is properly formatted (allows alphanumerics, spaces, commas, periods, and hyphens).
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
     * Validates if the age is between 18 and 40 (inclusive).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(short age) {
        return age >= 18 && age <= 50;
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
