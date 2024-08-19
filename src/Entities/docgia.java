package Entities;

import Proceed.Giaotiep;
import java.io.Serializable;
import java.util.Scanner;

public class docgia implements Serializable,Giaotiep{
    private int madg;
    private String tendg;
    private String diachi;
    private int sdtdg;
    private String emaildg;
   
    public int getMadg() {
        return madg;
    }

    public void setMadg(int madg) {
        this.madg = madg;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdtdg() {
        return sdtdg;
    }

    public void setSdtdg(int sdtdg) {
        this.sdtdg = sdtdg;
    }

    public String getEmaildg() {
        return emaildg;
    }

    public void setEmaildg(String emaildg) {
        this.emaildg = emaildg;
    }

    @Override
    public Object toObject() {
        return new Object[]{
            this.getMadg(),this.getTendg(),this.getDiachi(), this.getEmaildg(), this.getSdtdg()
        };

    }}