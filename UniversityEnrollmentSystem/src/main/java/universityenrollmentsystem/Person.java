/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityenrollmentsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private LocalDate dob;
    private String ID; // Staff ID or Student ID
    
    // Constructor
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    // SET AND GET METHODS
    
    // Setters
    public void setName(String name){ this.name = name; }
    public void setSurname(String surname){ this.surname = surname; }
    public void setDob(LocalDate dob){ this.dob = dob; }
    public void setID(String ID) { this.ID = ID; }
    
    // Getters
    public String getName(){ return name; }
    public String getSurname(){ return surname; }
    public LocalDate getDob() { return dob; }

    public int getAge() {
        if(dob == null)
            return-1;
        return LocalDate.now().getYear() - dob.getYear();
    }

    // Get Date of Birth in String "dd/MM/yyyy" format
    public String getStringDate(){
        if (dob == null) return "N/A";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dob.format(formatter);
        return formattedDate;
    }

    public String getID() { return ID; }
    
    
    @Override
    public String toString(){
        return name + " " + surname +  ", ID: " + ID + ", DOB: "  + getStringDate() + ", ";
    }
    @Override
    public int compareTo(Person other){
        if(this.surname == null && other.surname == null) return 0;
        if(this.surname == null) return -1;
        if(other.surname == null) return 1;
        int surnameCompare = this.surname.compareToIgnoreCase(other.surname);
        if(surnameCompare !=0) return surnameCompare;
        if(this.name == null && other.name == null) return 0;
        if(this.name == null) return -1;
        if(other.name == null) return 1;
        return this.name.compareToIgnoreCase(other.name);
    }
}

