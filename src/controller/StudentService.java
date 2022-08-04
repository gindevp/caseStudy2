package controller;

import model.Sevices;
import model.Student;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService implements Sevices {
    @Override
    public int checkIndex(List arr, String studentID) {
        List<Student> student= (List<Student>) arr;
        int index=0;
        for (int i = 0; i < arr.size(); i++) {
            if(student.equals(student.get(i).getStudentId())){
                index=i;
            }
        }
        return index;
    }

    @Override
    public Object search(List arr,String studentId) {
        return arr.get(checkIndex(arr,studentId));
    }

    @Override
    public boolean validate(String regex, String input) {
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        return matcher.matches();
    }
}
