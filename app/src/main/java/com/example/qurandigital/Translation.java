package com.example.qurandigital;

import java.io.Serializable;

public class Translation implements Serializable {
    private String ar;
    private String en;
    private String id;

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
