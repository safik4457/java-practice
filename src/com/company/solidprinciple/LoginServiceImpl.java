package com.company.solidprinciple;


public class LoginServiceImpl implements LoginService{
    public  String login(String username, String password){
        String u = "masud";
        String p = "123456";

        if (username==u && password == p){
            return "Login Success!";
        }
        else return null;
    }

    @Override
    public String logout() {
        return null;
    }


}
