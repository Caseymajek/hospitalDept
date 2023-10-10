package org.example;
import java.util.Objects;

public class Department {
    private String admin;
    private String records;
    private String laboratory;
    private String physiotherapy;
    private String pharmacy;
    private String theatre;
    private String ICU;
    private String nursery;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public String getPhysiotherapy() {
        return physiotherapy;
    }

    public void setPhysiotherapy(String physiotherapy) {
        this.physiotherapy = physiotherapy;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getICU() {
        return ICU;
    }

    public void setICU(String ICU) {
        this.ICU = ICU;
    }

    public String getNursery() {
        return nursery;
    }

    public void setNursery(String nursery) {
        this.nursery = nursery;
    }
}
