package model;

import java.util.List;

public interface CRUD<E>{
    boolean add(List <E> arr, E element, String pathFile);
    void edit(int index, List <E> arr, E element, String pathFile);
    void remove(int index,List <E> arr, String pathFile);

}
