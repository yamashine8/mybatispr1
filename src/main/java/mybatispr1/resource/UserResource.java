package mybatispr1.resource;

import mybatispr1.mapper.UserMapper;
import mybatispr1.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserResource {
    private UserMapper userMapper;

    public UserResource(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public  List<Users> getAll(){
        return  userMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update(){
        Users users = new Users();
        users.setId(5);
        users.setName("Пётр");
        users.setSalary(46000L);
        userMapper.insert(users);
        return userMapper.findAll();
    }

}