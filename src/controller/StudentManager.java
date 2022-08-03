package controller;

import model.CRUD;
import model.Sevices;
import storage.FileWriteRead;

import java.io.FileInputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  StudentManager implements CRUD, Sevices {
    FileWriteRead fileWriteRead= new FileWriteRead();
    @Override
    public void add(List arr, Object element, String pathFile) {
        arr.add(element);
        fileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public void edit(int index, List arr, Object element, String pathFile) {
        arr.set(index,element);
        fileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public void remove(int index, List arr,String pathFile) {
         arr.remove(index);
        fileWriteRead.writeFile(arr,pathFile);
    }

    @Override
    public Object search(int index, List arr) {
       return arr.get(index);
    }

    @Override
    public boolean validate(String regex, String input) {
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        return matcher.matches();
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
