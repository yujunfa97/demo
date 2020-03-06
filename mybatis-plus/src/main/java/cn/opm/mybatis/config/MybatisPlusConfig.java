package cn.opm.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.apache.ibatis.reflection.MetaObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;

/**
 * @ClassName MybatisPlusConfig
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/20 10:59
 * @Version 1.0
 * @Blame OPM Team
 */
@EnableTransactionManagement
@Configuration
@MapperScan("cn.opm.mybatis.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }

    @Bean
    public IdentifierGenerator identifierGenerator() {
        return new CustomIdGenerator();
    }

    @Bean
    public MetaObjectHandler metaObjectHandler() {
        return new MyMetaObjectHandler();
    }

    static class MyMetaObjectHandler implements MetaObjectHandler {

        @Override
        public void insertFill(MetaObject metaObject) {
            this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
            this.fillStrategy(metaObject, "createTime", new Date());
            this.strictUpdateFill(metaObject, "updateTime", Date.class,  new Date());
        }

        @Override
        public void updateFill(MetaObject metaObject) {
            this.strictUpdateFill(metaObject, "updateTime", Date.class,  new Date());
            setFieldValByName("updateTime", new Date(), metaObject);
        }

    }

    static class CustomIdGenerator implements IdentifierGenerator {

        @Override
        public Number nextId(Object entity) {
            return null;
        }
    }
}