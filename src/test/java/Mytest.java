import com.Utils.getSeesionUtils;
import com.dao.StudentDao;
import com.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void t1() {
        SqlSession sql = getSeesionUtils.getsession();
        StudentDao mapper = sql.getMapper(StudentDao.class);
        Student s = mapper.FindById(12, 22);
        System.out.println(s.getAddress());
    }

    @Test
    public void t2() {
        SqlSession sql = getSeesionUtils.getsession();
        StudentDao mapper = sql.getMapper(StudentDao.class);
        List<Student> students = mapper.FindStudentByTeacher(23);
        System.out.println(students);
    }
    @Test
    public void t3() {
        SqlSession sql = getSeesionUtils.getsession();
        StudentDao mapper = sql.getMapper(StudentDao.class);
        Student students = mapper.selectByIf(22,"xugaowei");
        System.out.println(students);
    }
}
