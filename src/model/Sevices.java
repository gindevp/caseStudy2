package model;

import java.util.List;

public interface Sevices<E> {
    int checkIndex(List<E> arr, String element);
    E search(List<E> arr,String element );
    boolean validate(String regex,String input);
}
