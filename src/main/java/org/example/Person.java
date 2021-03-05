package org.example;

import javafx.geometry.Point2D;
import javafx.scene.PointLight;
import javafx.scene.effect.Light;

public class Person {
    private  String navn;
    private int ID,alder;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String titel;

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }



    public String isRayThere(PointLight location){
        String ray =location.getId();
        String outcome;
        if(ray.equals("there")){

            return ray;
        } else{
            return "Square";
        }
    }
}
