package mybatispr1.mapper;

import mybatispr1.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<Users> findAll();

    @Insert("INSERT INTO users(id, name, salary) VALUES (#{id}, #{name}, #{salary})")
    void insert(Users users);
}
