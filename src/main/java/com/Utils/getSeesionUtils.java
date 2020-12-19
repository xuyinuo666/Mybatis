package com.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class getSeesionUtils {
    //!!!!!!!!!!!!!!!!!!!!!!!!???????????????????????
    private static String config = "com/config/Mybatis.xml";
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //加载文件地址
            InputStream in = Resources.getResourceAsStream(config);
            //根据文件创建工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //获取连接
    public static SqlSession getsession() {
        return sqlSessionFactory.openSession();
    }
}
