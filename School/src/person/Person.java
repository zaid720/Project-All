/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author ITS
 */
public class Person {
    
    private String name, address, classSchool, nationality, birthday, placeBirth;
    private boolean gender;
    private int age;

    public Person(String name, int age, String address, String classSchool, boolean gender, String nationality, String birthday, String placeBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.classSchool = classSchool;
        this.gender = gender;
        this.nationality = nationality;
        this.birthday = birthday;
        this.placeBirth = placeBirth;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classSchool='" + classSchool + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthday='" + birthday + '\'' +
                ", placeBirth='" + placeBirth + '\'' +
                ", gender=" + gender +
                ", age=" + age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(String classSchool) {
        this.classSchool = classSchool;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }
    
    
    
}
