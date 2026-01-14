package spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Service;

import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Model.Comment;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {
    private Logger log= Logger.getLogger(UserService.class.getName());
    private final List<User>users=new ArrayList<>();
    private final List<Comment>comments=new ArrayList<>();

    public List<User> getAllUser(){
        return users;
    }

    public User fingByName(String name){
        User found=null;
        try {
            for(int i=0;i<users.size(); i++) {
                if (name.equals(users.get(i).getName())) {
                    found= users.get(i);
                }
            }

            return found;

        } catch (Exception e){
            log.warning("Error: "+e);
            return null;
        }

    }

    public User getByAge(int age){
        User found=null;
        for(int i=0;i<users.size();i++){
            if(age==users.get(i).getAge()){
                found=users.get(i);

            }
        }
        return found;
    }

    public List<Comment>getAllComment(){
        return comments;
    }

    public void add(User user){
        users.add(user);
        if (user.getComment() != null) {
            comments.add(user.getComment());
        }
    }

}
