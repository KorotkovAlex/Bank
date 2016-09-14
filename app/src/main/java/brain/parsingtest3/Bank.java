package brain.parsingtest3;

import java.util.ArrayList;

/**
 * Created by Саня on 14.09.2016.
 */
public class Bank {
    private String nameBank;
    private ArrayList<Course> courses;
    private String address;
    private String phoneNumber;
    private String img;
    public void setName(String name) {
        this.nameBank = name;
    }

    public String getName() {
        return nameBank;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }
}
