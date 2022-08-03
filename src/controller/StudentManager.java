package controller;

import model.CRUD;
import model.Sevices;
import storage.FileWriteRead;

import java.io.FileInputStream;
import java.util.List;

public class StudentManager implements CRUD, Sevices {

    @Override
    public boolean add(List arr, Object element, String pathFile) {
        boolean status=arr.add(element);
        FileWriteRead.writeFile(arr,pathFile);
        return status;
    }

    @Override
    public void edit(int index, List arr, Object element, String pathFile) {
        arr.set(index,element);
        FileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public void remove(int index, List arr,String pathFile) {
         arr.remove(index);
        FileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public Object search(int index, List arr) {
       return arr.get(index);
    }

    @Override
    public int checkIndex(List arr, String element) {
        int id=0;
        for (int i = 0; i < arr.size(); i++) {
            if(element== arr.get(i)){
                id=i;
            }
        }
        return id;
    }
}