package cn.opm.mybatis.mapper;

import cn.opm.mybatis.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getAllById(@Param("id")Long id);

    List<User> getByAll(User user);

    List<User> findAllByAgeBetween(@Param("minAge")Integer minAge,@Param("maxAge")Integer maxAge);

    List<User> findAllByAgeBetweenEqual(@Param("minAge")Integer minAge,@Param("maxAge")Integer maxAge);

    int insertList(@Param("list")List<User> list);

    IPage<User> selectPageVo(Page<?> page);

}