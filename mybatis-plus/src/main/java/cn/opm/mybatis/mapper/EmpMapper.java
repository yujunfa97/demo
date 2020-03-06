package cn.opm.mybatis.mapper;

import cn.opm.mybatis.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;import java.util.List;

public interface EmpMapper extends BaseMapper<Emp> {
    int deleteByPrimaryKey(String id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> findByAll(Emp emp);
}