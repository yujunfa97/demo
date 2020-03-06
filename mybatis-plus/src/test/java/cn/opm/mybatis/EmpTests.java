package cn.opm.mybatis;

import cn.opm.mybatis.entity.Emp;
import cn.opm.mybatis.mapper.EmpMapper;
import com.google.common.base.Preconditions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.plaf.OptionPaneUI;
import java.util.List;

/**
 * @ClassName EmpTests
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/20 14:23
 * @Version 1.0
 * @Blame OPM Team
 */
public class EmpTests extends BaseTests {
    @Autowired
    EmpMapper empMapper;
    @Test
    public void test() {
        Emp emp = new Emp();
        emp.setAge(28);
        emp.setName("Mary...Mary...");
        emp.setFlag(0);
        int rows = empMapper.insert(emp);
        System.out.println(emp);
        System.out.println(rows);
    }
    @Test
    public void test1() {
        List<Emp> emps = empMapper.findByAll(null);
        emps.forEach(System.out::println);
        emps = empMapper.selectList(null);
        emps.forEach(System.out::println);
    }

    @Test
    public void test3() {
        Emp emp = empMapper.selectById("f199bc79cfb8b9e0332cf348b0ff977a");
        Preconditions.checkNotNull(emp);
        emp.setAge(1000);
        int rows = empMapper.updateById(emp);
        System.out.println(rows);
    }
}
