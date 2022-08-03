package model;

import java.util.List;

public interface Sevices<E> {
    int checkIndex(List<E> arr, String element);
    E search(int index,List<E> arr );
}
