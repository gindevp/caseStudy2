package controller;

import model.Services;
import model.Student;
import model.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService implements Services {
    @Override
    public int checkIndex(List arr, String userID) {
        List<User> userList= (List<User>) arr;
        int index=0;
        for (int i = 0; i < arr.size(); i++) {
            if(userID.equals(userList.get(i).getStaffId())){
                index=i;
            }
        }
        return index;
    }

    @Override
    public Object search(List arr, String userId) {
        return arr.get(checkIndex(arr,userId));
    }

    @Override
    public boolean validate(String regex, String input) {
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        return matcher.matches();
    }
}
