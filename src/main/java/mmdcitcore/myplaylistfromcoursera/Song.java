/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
 class Song extends Media {
   
     //since media has title and duration, its just missing artist
    private String artist;
    
    public Song (String title, int duration, String artist){
        super (title, duration);
        this.artist = artist;
    }
   
    @Override
    public void play(){
        System.out.println("Playing song: " + getTitle() + "by" + artist);
    }  
}
