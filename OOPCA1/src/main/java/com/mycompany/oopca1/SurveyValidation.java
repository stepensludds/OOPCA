/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopca1;

/**
 *
 * @author Joe Grace
 * x22448734
 */

// This class is used for validating survey data
public class SurveyValidation { 
    
    // Variable to store the monthly electricity bill
    private double monthlyElectricityBill;

    // Default constructor
    public SurveyValidation() {
    }
    
    // Getter for monthlyElectricityBill
    public double getMonthlyElectricityBill() {
        return monthlyElectricityBill;
    }
    
    // Setter for monthlyElectricityBill
    public void setMonthlyElectricityBill(double monthlyElectricityBill) {
        this.monthlyElectricityBill = monthlyElectricityBill;
    }
    
    // Method to validate the monthly electricity bill
    // Returns true if the bill is greater than 0
    public boolean validateElectricityBill() {
        return this.monthlyElectricityBill > 0;
    }
    
    // Method to validate all fields
    // Returns a string with validation messages
    public String validateAll() {
        // Use StringBuilder for efficient string concatenation
        StringBuilder validationMessage = new StringBuilder();
        
        // Validate the electricity bill
        if (!validateElectricityBill()) {
            // If the bill is invalid, append a message to the validationMessage
            validationMessage.append("Electricity bill input is invalid.\n");
        }
        
        // If no validation messages were added, all fields are valid
        if (validationMessage.length() == 0) {
            validationMessage.append("All fields were inputted correctly.");
        }
        
        // Return the validation messages
        return validationMessage.toString();
    }
}
