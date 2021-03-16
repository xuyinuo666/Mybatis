package dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.User;

public interface UserDao {

    User selectByID(@Param("userID") int id);
    //可以使用纯java方式将SQL执行,注意一定要有 Mybatis 文件中的注册中心   不能省略
    @Insert("insert into user (id ,name,email,age) values (#{userID},#{userName},#{userEmail},#{userAge})")
    int inserUser(User user);
}
