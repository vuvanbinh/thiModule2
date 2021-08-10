package controller;

import model.DanhBa;
import stogera.FileDanhBa;

import java.util.ArrayList;
import java.util.List;

public class QLDanhBa {
    List<DanhBa> danhBaList = new ArrayList<>();

    public int getIndexOfPhoneNumber(int phoneNumber){
        int index = -1;
        for (int i = 0; i < danhBaList.size(); i++) {
            int _phoneNumber =  danhBaList.get(i).getSdt();
            if(_phoneNumber == phoneNumber){
                index = i;
                break;
            }
        }
        return index;
    }

    public void add(DanhBa danhBa){
        danhBaList.add(danhBa);
        FileDanhBa.writeFile(danhBaList,"danhBa.txt");
    }

    public void edit(int phoneNumber,DanhBa danhBa){
        int index = getIndexOfPhoneNumber(phoneNumber);
        danhBaList.set(index,danhBa);
        FileDanhBa.writeFile(danhBaList,"danhBa.txt");
    }

    public void delete(int phoneNumber){
        int index = getIndexOfPhoneNumber(phoneNumber);
        danhBaList.remove(index);
        FileDanhBa.writeFile(danhBaList,"danhBa.txt");
    }

    public List<DanhBa> findByName(String name){
        List<DanhBa> danhBas = new ArrayList<>();
        for (DanhBa o : danhBaList
                ) {
            if(o.getTen().equals(name)){
                danhBas.add(o);
            }
        }
        return danhBas;
    }







    public QLDanhBa(List<DanhBa> danhBaList) {
        this.danhBaList = danhBaList;
    }
    public List<DanhBa> getDanhBaList() {
        return danhBaList;
    }

    public void setDanhBaList(List<DanhBa> danhBaList) {
        this.danhBaList = danhBaList;
    }



}
