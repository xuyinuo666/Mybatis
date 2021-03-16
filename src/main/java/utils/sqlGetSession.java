package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlGetSession {
    static SqlSessionFactory build;
    static {
        String resources = "mybatisConfig/mybatisConfig.xml";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(resources);
             build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static SqlSession getSession(){
        return build.openSession();
    }
}
