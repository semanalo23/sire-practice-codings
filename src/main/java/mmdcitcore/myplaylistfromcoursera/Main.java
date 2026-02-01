/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.myplaylistfromcoursera;

/**
 *
 * @author ASPIRE 7
 */
public class Main {
    
    public static void main(String[] args){
        
        //Create a media object on the constructor
        Media s1 = new Song("Golden Hour ", 200," JVKE");
        s1.play();
        
        Media s2 = new Song("Sunbeams ",180," Elira Pendora");
        s2.play();
        
        Media s3 = new Song ("Suki Suki Daisuki ",300," Ouro Kronii");
        s3.play();
        
        Media s4 = new Podcast("DXYZ Gaming Journey ", 3600, "Ervin Estolano");
        s4.play();
        
        Media s5 = new PodcastEpisode("DXYZ Gaming Journey ",3600, "Ervin Estolano",13);
        s5.play();
    }
}
    
    