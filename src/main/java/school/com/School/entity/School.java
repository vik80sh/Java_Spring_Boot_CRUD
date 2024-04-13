package school.com.School.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "pin_code")
    private int pin_code;
    @Column(name = "active")
    private boolean active;
    @Column(name = "school_name")
    private String school_name;
    @Column(name = "address")
    private String address;
    @Column(name = "state")
    private  String state;
    @Column(name = "city")
    private String city;

    @Column(name = "email")
    private String email;
    @Column(name = "phone_number_primary")
    private  String phone_number_primary;
    @Column(name = "phone_number_secondary")
    private String phone_number_secondary;
    @Column(name = "password")
    private String password;
    @Column(name = "last_active_date")
    private String last_active_date;

    public School(){}

    public School(int pin_code, boolean active,
                  String school_name,
                  String address, String state, String city,
                  String email, String phone_number_primary,
                  String phone_number_secondary,
                  String password,
                  String last_active_date) {
        this.pin_code = pin_code;
        this.active = active;
        this.school_name = school_name;
        this.address = address;
        this.state = state;
        this.city = city;
        this.email = email;
        this.phone_number_primary = phone_number_primary;
        this.phone_number_secondary = phone_number_secondary;
        this.password = password;
        this.last_active_date = last_active_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin_code;
    }

    public void setPin(int pin_code) {
        this.pin_code = pin_code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number_primary() {
        return phone_number_primary;
    }

    public void setPhone_number_primary(String phone_number_primary) {
        this.phone_number_primary = phone_number_primary;
    }

    public String getPhone_number_secondary() {
        return phone_number_secondary;
    }

    public void setPhone_number_secondary(String phone_number_secondary) {
        this.phone_number_secondary = phone_number_secondary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return last_active_date;
    }

    public void setDate(String last_active_date) {
        this.last_active_date = last_active_date;
    }
}
