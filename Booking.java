/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Group 15
 */
public class Booking {
    private String firstname; 
    private String lastname; 
    private String checkin; 
    private String checkout; 
    private String roomtype; 
    private String roomnumber; 
    
    public Booking(String FirstName, String LastName, String CheckIn, String CheckOut, String RoomType, String RoomNumber){
        
        this.firstname = FirstName; 
        this.lastname = LastName; 
        this.checkin = CheckIn; 
        this.checkout = CheckOut; 
        this.roomtype = RoomType; 
        this.roomnumber = RoomNumber; 
    }
        public String getFirstName(){
        
            return firstname; 
        }
        
        public String getLastName(){
        
            return lastname; 
        }
        
        public String getCheckIn(){
        
            return checkin; 
        }
        
        public String getCheckOut(){
        
            return checkout; 
        }
        
        public String getRoomType(){
            
            return roomtype; 
        }
        
        public String getRoomNumber(){
            
            return roomnumber; 
        }
  }

