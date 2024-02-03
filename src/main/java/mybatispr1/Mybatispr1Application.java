package mybatispr1;

import org.apache.catalina.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("mybatispr1.mapper")
@SpringBootApplication
public class Mybatispr1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatispr1Application.class, args);
    }

}
