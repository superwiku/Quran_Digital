package com.example.qurandigital;

import java.io.Serializable;

public class Ayat implements Serializable {
    private String name;
    private Translation name_translations;
    private int number_of_ayah;
    private String type;
    private String recitations;
    private Verses verses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Translation getName_translations() {
        return name_translations;
    }

    public void setName_translations(Translation name_translations) {
        this.name_translations = name_translations;
    }

    public int getNumber_of_ayah() {
        return number_of_ayah;
    }

    public void setNumber_of_ayah(int number_of_ayah) {
        this.number_of_ayah = number_of_ayah;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRecitations() {
        return recitations;
    }

    public void setRecitations(String recitations) {
        this.recitations = recitations;
    }

    public Verses getVerses() {
        return verses;
    }

    public void setVerses(Verses verses) {
        this.verses = verses;
    }
}
