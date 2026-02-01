/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
abstract class Media {
   
    //declaring variables 
   private String title;
   private int durationInSeconds;
   
   //constructor
   public Media (String title, int duration){
       this.title = title;
       this.durationInSeconds = duration;
   }
   
   //getter for title
    public String getTitle(){
        return title;
    }
    
      //getter for song duration
    public int getDuration(){
        return durationInSeconds;
    }
    
    public abstract void play();
}
    
