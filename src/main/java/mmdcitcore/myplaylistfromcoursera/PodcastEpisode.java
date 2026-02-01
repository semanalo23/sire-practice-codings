/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
public class PodcastEpisode extends Podcast {
    
    protected int episodeNumber;
    
    public PodcastEpisode(String title, int duration, String host, int episodeNumber){
        super(title, duration, host);
        this.episodeNumber = episodeNumber;
    }
    
    @Override
    public void play(){
        System.out.println("Episode 12: " + title);
        System.out.println("Hosted by : " + host);
    }
}
