/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
class Audiobook extends Media {
    protected String seriesName;
    protected String author;
    protected String narrator;
    
    public Audiobook (String title, int duration, String seriesName, String author, String narrator){
        super (title, duration);
        this.seriesName = seriesName;
        this.author = author;
        this.narrator = narrator;
    }
 
    @Override
    public void play(){
        System.out.println("Now playing :" + seriesName + " written by " + author + " and narrated by: " + narrator);
    }
}
