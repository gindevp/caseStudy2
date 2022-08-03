package model;

import java.util.List;

public interface IOUploadFile<E> {
    void writeFile(List<E> list, String pathFile);
    List<E> readFile(String pathFile);
}
