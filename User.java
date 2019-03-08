/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logincheck;

/**
 *
 * @author HİLAL
 */
class User {
    private int uid;
    private String name,gender,address,department,course;
    
   public User(int uid,String name,String gender,String address,String department,String course) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.course = course;
    }
    
    public int getuid() {
        return uid;
    }
    
    public String getname() {
        return name;
    }
    
    public String getgender() {
        return gender;
    }
    public String getaddress() {
        return address;
    }
    public String getdepartment() {
        return department;
    }
    public String getcourse() {
        return course;
    }
    
}
