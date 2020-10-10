package com.company;

public class User {
    private String password1;
    private String salt;
    private String hash;

    //Setter
    public void setPassword1 (String password1){
        this.password1 = password1;
    }
    //getter
    public String getPassword1 (){
        return password1;
    }
    public void setSalt (String salt){
        this.salt = salt;
    }
    //getter
    public String getSalt (){
        return salt;
    }
    public void setHash (String hash){
        this.hash = hash;
    }
    //getter
    public String getHash (){
        return hash;
    }
    //constructor
    public User (String _password1, String _salt, String _hash){
        password1 = _password1;
        salt = _salt;
        hash = _hash;
    }
    public static void main(String[] args) {
	// write your code here
    }

    public String getPassword() {
    }

    public void setPassword(String s) {
    }
}
