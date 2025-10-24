package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());



        redRemote.turnOn();
        System.out.println("TV encendida: " + redRemote.on);

        redRemote.channelUp();
        System.out.println("Subir un canal: " + redRemote.channel);

        redRemote.channelDown();;
        System.out.println("Bajar un canal: " + redRemote.channel);

        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("No se puede bajar canal: " + redRemote.channel);

        redRemote.volumeUp();
        System.out.println("Subir volumen: " + redRemote.volume);

        redRemote.volumeDown();
        System.out.println("Bajar volumen: " + redRemote.volume);

        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("No se puede bajar volumen: " + redRemote.volume);

        System.out.println("Color del mando 1: " + redRemote.getColor());
        System.out.println("Color del mando 2: " + blackRemote.getColor());

        redRemote.turnOff();
        System.out.println("Apagar TV: " + redRemote.on);









    }
}