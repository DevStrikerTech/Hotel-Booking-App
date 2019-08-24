/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Group 15
 */
public class registerCustomer {
    
    private String email;
    private String password;
    private String address;
    private String credit; 
    private String exp;
    private String security; 
    
    public registerCustomer (String Email, String Password, String Address, String Credit, String Exp, String Security){
    
        this.email = Email;
        this.password = Password; 
        this.address = Address; 
        this.credit = Credit; 
        this.exp = Exp; 
        this.security = Security; 
    
    }

    public String getEmail(){
    
        return email;
    }
    
    public String getPassword(){
    
        return password;
    }
    
    public String getAddress(){
    
        return address;
    }
    
    public String getCredit(){
    
        return credit;
    }
    
    public String getExp(){
    
        return exp;
    }
    
    public String getSecurity(){
    
        return security;
    }

}

