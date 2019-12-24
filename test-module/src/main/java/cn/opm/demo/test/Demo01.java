package cn.opm.demo.test;

import cn.hutool.core.util.IdUtil;
import cn.hutool.db.Entity;
import cn.hutool.db.Session;
import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 * @ClassName Demo01
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/21
 * @Version 1.0
 * @Blame OPM Team
 */
public class Demo01 {
    public static final Logger LOG = LoggerFactory.getLogger(Demo01.class);

    public static void main(String[] args) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&createDatabaseIfNotExist=true&serverTimezone=GMT%2B8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setInitialSize(3);
        dataSource.setMaxActive(10);
        dataSource.setMaxWait(10000);
        Session session = new Session(dataSource);
        Entity entity = new Entity("hutool_test");
        entity.set("id", 1111);
        entity.set("name", IdUtil.fastSimpleUUID());
        entity.set("age", 20);
        try {
            int rows = session.insert(entity);
            LOG.info("rows: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*try {
            LOG.warn(String.valueOf(LOG.isDebugEnabled()));
            LOG.info(session.getConnection().toString());
            List<Entity> entities = session.findAll("hutool_test");
            entities.forEach(entity -> LOG.error(entity.toString()));
        } catch (SQLException e) {
            LOG.error(e.getMessage());
        }*/
        dataSource.close();
    }
}
