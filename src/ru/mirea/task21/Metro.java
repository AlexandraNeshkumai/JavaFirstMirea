package ru.mirea.task21;

import java.util.ArrayList;

public class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Khovrino");
        lines.add("Belomorskaya");
        lines.add("Rechnoi Vokzal");
        lines.add("Water Stadium");
        lines.add("Voykovskaya");
        lines.add("Sokol");
        lines.add("Airport");
        lines.add("Dynamo");
        lines.add("Belaruskaya");
        lines.add("Mayakovskaya");
        lines.add("Tverskaya");
        lines.add("Theatrical");
        lines.add("Paveletskaya");
        lines.add("Avtozavodskaya");
        lines.add("Kolomenskaya");
        lines.add("Kashirskaya");
        lines.add("Kantemirovskaya");
        lines.add("Tsaritsyno");
        lines.add("Orekhovo");
        lines.add("Domodedovo");
        lines.add("Krasnogvardeyskaya");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Линия: " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Линия: " + lines.get(i));
        }
    }
}