package cn.opm.mybatis;

import cn.hutool.core.lang.UUID;
import cn.opm.mybatis.entity.User;
import cn.opm.mybatis.mapper.UserMapper;
import cn.opm.mybatis.service.IBaseService;
import cn.opm.mybatis.service.impl.UserServiceImpl;
import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectSubqueryTableSource;
import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserTests
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/20 10:04
 * @Version 1.0
 * @Blame OPM Team
 */
public class UserTests extends BaseTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    IBaseService userService;

    @Test
    public void iServiceTest() {
        User user = userService.getById(112L);
        System.out.println(user);
//        User user = new User();
//        user.setId(112L);
//        user.setFlag(true);
//        userMapper.insert(user);
//        System.out.println(user);
        /*Page<User> userPage = new Page<>();
        userPage.setSize(4).setCurrent(2);
        userService.page(userPage).getRecords().forEach(System.out::println);*/
        /*User user = new User();
        user.setId(18L);
        user.setName("yujunfa");
        user.setAge(18);
        user.setEmail("12306@gmail.com");
        boolean flag = userService.save(user);
        System.out.println(flag);*/
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        userService.list().forEach(System.out::println);
    }

    @Test
    public void test() {
/*        User user = userMapper.getAllById(1L);
        System.out.println(user);
        List<User> users = userMapper.getByAll(null);
        users.forEach(System.out::println);
        users = userMapper.findAllByAgeBetweenEqual(20, 25);
        users.forEach(System.out::println);
        users = userMapper.findAllByAgeBetween(20, 25);
        users.forEach(System.out::println);
        System.out.println("-----------------------------");
        Map<String,Object> map = Maps.newHashMap();
        map.put("id", 1);
        map.put("age", "18");
        users = userMapper.selectList(new QueryWrapper<User>().allEq(true , map, false));
        users.forEach(System.out::println);

        System.out.println("=============================");
        users = userMapper.selectList(new QueryWrapper<User>().ne(true, "id", 2).or());
        users.forEach(System.out::println);

        System.out.println("0000000000000000000000000000");
        LambdaQueryWrapper<User> abstractWrapper = new QueryWrapper<User>().lambda().eq(User::getId, 1);
        users = userMapper.selectList(abstractWrapper);
        users.forEach(System.out::println);

        Page<User> page = new Page<>();
        page.setSize(3);
        page.setCurrent(2);
        IPage<User> userIPage  = userMapper.selectPageVo(page);
        System.out.println(userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);*/
    }
}
