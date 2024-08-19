package Entities;

import Proceed.Giaotiep;
import java.io.Serializable;

public class sach implements Serializable,Giaotiep{ 
      private int masach,soluong,giathanh;
    private String tensach,tacgia,nxb,theloai, tinhtrang;//
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getGiathanh() {
        return giathanh;
    }

    public void setGiathanh(int giathanh) {
        this.giathanh = giathanh;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    

    @Override  
    public Object toObject() {
        return new Object[]{
            this.getMasach(),this.getTensach(),this.getTheloai(),this.getTacgia(),this.getNxb(),this.getGiathanh(),  this.getSoluong(),this.getTinhtrang()
        };
    }

    }
   
