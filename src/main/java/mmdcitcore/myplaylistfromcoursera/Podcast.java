/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
class Podcast extends Media {
    
    //podcast has hosts
    protected String host;
    
    public Podcast (String title, int duration, String host){
    
        super(title, duration);
        this.host = host;
        
    }
    
    @Override
    public void play(){
        System.out.println("Playing podcast hosted " + getTitle() + "by : " + host);
    }
    
}
