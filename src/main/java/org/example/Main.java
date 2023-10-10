package org.example;
import java.util.Objects;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
User avon = new User();
avon.setName("AVON");
        System.out.println("The name of the hospital is :" + avon.getName());
         Department clinicalCare = new Department();
         clinicalCare.setAdmin("Admin");
         clinicalCare.setRecords("Records");
         clinicalCare.setLaboratory("Laboratory");
         clinicalCare.setPhysiotherapy("Physiotherapy");
         clinicalCare.setPharmacy("Pharmacy");
         clinicalCare.setTheatre("Theatre");
         clinicalCare.setICU("ICU");
         clinicalCare.setNursery("Nursery");
        Department clinicalCare1 = new Department();
        clinicalCare.setAdmin("Admin");
        clinicalCare.setRecords("Records");
        clinicalCare.setLaboratory("Laboratory");
        clinicalCare.setPhysiotherapy("Physiotherapy");
        clinicalCare.setPharmacy("Pharmacy");
        clinicalCare.setTheatre("Theatre");
        clinicalCare.setICU("ICU");
        clinicalCare.setNursery("Nursery");
       // clinicalCare.addDepartment (clinicalCare1)
        System.out.println("Are they equal :" + Objects.equals (clinicalCare, clinicalCare1));
        System.out.println("The first point of contact is the :" + clinicalCare.getAdmin());





    }
}