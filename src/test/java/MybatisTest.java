import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.sqlGetSession;

public class MybatisTest {
    SqlSession session = sqlGetSession.getSession();
    UserDao mapper = session.getMapper(UserDao.class);
    @Test
    public void t1() {
        User user = mapper.selectByID(1);
        System.out.println(user);
    }
    @Test
    public void t2() {
        mapper.inserUser(new User(2221,"xugaowei",33,"2222@gmail.com"));
        session.commit();
    }
}
