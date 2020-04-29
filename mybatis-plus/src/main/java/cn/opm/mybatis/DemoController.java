package cn.opm.mybatis;

import cn.opm.mybatis.entity.Emp;
import cn.opm.mybatis.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

/**
 * @Class controller
 * @Description 接口的描述
 * @Author OPM
 * @Date 2020/4/28
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private EmpMapper empMapper;

    @GetMapping("{id}")
    @Cacheable(value = "emp", key = "targetClass + methodName + #p0")
    public Emp sayHello(@PathVariable("id") String id) {
        return empMapper.selectById(id);
    }

    @PostMapping
    @CacheEvict(value = "emp", allEntries = true)
    public boolean addHello() {
        return true;
    }

    @PutMapping
    public boolean updateHello() {
        return false;
    }

    @DeleteMapping
    public boolean deleteHello() {
        return true;
    }
}
