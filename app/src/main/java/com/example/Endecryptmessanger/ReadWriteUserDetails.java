package com.example.Endecryptmessanger;

//import com.google.firebase.auth.FirebaseUser;

public class ReadWriteUserDetails {
    public String name,age,mobile,gender,blocked;
    public boolean admin;


    public ReadWriteUserDetails(String name, String age, String mobile, String gender, boolean admin, String blocked) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.gender = gender;
        this.admin=admin;
        this.blocked=blocked;
    }

    public ReadWriteUserDetails(){

    }
}
