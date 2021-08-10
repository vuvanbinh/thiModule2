package stogera;

import model.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDanhBa {


    public static void writeFile(List<DanhBa> danhBaList, String fileName){
        File file = new File(fileName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhBaList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DanhBa> readFile(String fileName){
        List<DanhBa> danhBas = new ArrayList<>();
        File file = new File(fileName);
        if(file.length()>0){
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                danhBas = (List<DanhBa>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return danhBas;
    }
}
