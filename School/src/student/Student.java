/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import person.Person;

/**
 *
 * @author ITS
 */
public class Student extends Person{
    
    private String fatherName, motherName, profession;
    private int numberCardFather, numberPhoneFather;
    long id;

    public Student(long id, String name, int age, String address, String classSchool, boolean gender, String nationality, String birthday, String placeBirth, String fatherName, String motherName, String profession, int numberCardFather, int numberPhoneFather) {
        super(name, age, address, classSchool, gender, nationality, birthday, placeBirth);
        this.id = id;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.profession = profession;
        this.numberCardFather = numberCardFather;
        this.numberPhoneFather = numberPhoneFather;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                super.toString() +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", profession='" + profession + '\'' +
                ", numberCardFather=" + numberCardFather +
                ", numberPhoneFather=" + numberPhoneFather +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getNumberCardFather() {
        return numberCardFather;
    }

    public void setNumberCardFather(int numberCardFather) {
        this.numberCardFather = numberCardFather;
    }

    public int getNumberPhoneFather() {
        return numberPhoneFather;
    }

    public void setNumberPhoneFather(int numberPhoneFather) {
        this.numberPhoneFather = numberPhoneFather;
    }

}
