package org.example;
import java.util.Objects;
public class User {
    private String name;
    private int age;
    private char gender;
    private String placeOfResidence;
    private String NOK;
    private Float weight;
    private Float height;
    private Long phoneNumber;
    private String genotype;
    private String diagnosis;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && gender == user.gender && Objects.equals(name, user.name) && Objects.equals(placeOfResidence, user.placeOfResidence) && Objects.equals(NOK, user.NOK) && Objects.equals(weight, user.weight) && Objects.equals(height, user.height) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(genotype, user.genotype) && Objects.equals(diagnosis, user.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, placeOfResidence, NOK, weight, height, phoneNumber, genotype, diagnosis);
    }
//private blood

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getNOK() {
        return NOK;
    }

    public void setNOK(String NOK) {
        this.NOK = NOK;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }



}
