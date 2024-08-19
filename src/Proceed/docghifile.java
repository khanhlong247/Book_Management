package Proceed;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class docghifile {
    public void ghi(List list,String fileName){
        try   
            (FileOutputStream fos=new FileOutputStream(new File(fileName))){ 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }
        catch (Exception e){                                               
            System.out.println("got an exception");
        }
    }
     public ArrayList doc(String fileName){
         ArrayList<Giaotiep> list;
        list = new ArrayList();
        try(FileInputStream fos=new FileInputStream(new File(fileName))){
            ObjectInputStream oos = new ObjectInputStream(fos);
            list = (ArrayList<Giaotiep>) oos.readObject();
        }catch (Exception e){
            System.out.println("got an exception");
        }

        return list;
    }

    }

