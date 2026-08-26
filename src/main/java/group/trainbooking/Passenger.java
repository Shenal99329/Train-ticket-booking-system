/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.trainbooking;

/**
 *
 * @author Legion
 */
public class Passenger {
    private String title;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String mobile;
    private String password;
    
    public Passenger(String title,String fname,String lname,String email,String username,String mobile,String password) 
    {
        this.title = title;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.mobile = mobile;
        this.password = password;
    }
    public String gettitle()
    {
        return title; 
    }
    public String getfname()
    {
        return fname;
    }
    public String getlname() 
    {
        return lname;
    }
    public String getemail() 
    {
        return email;
    }
    public String getusername()
    {
        return username;
    }
    public String getmobile()
    {
        return mobile;
    }
    public String getpassword()
    {
        return password;
    }
    
}
