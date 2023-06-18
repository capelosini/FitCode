/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heathproject;

/**
 *
 * @author capel
 */
public class User {
    Object[] userData;
    
    void createUser(String name, String secondName, String email, String password, float height, float weight){
        Object[] temp={name, secondName, email, password, height, weight};
        this.userData=temp;
    }
    
    Object get(String target){
        switch (target){
            case "name":
                return (String)this.userData[0];
            case "secondName":
                return (String)this.userData[1];
            case "email":
                return (String)this.userData[2];
            case "password":
                return (String)this.userData[3];
            case "height":
                return (float)this.userData[4];
            case "weight":
                return (float)this.userData[5];
            default:
                return null;
        }
    }
}
