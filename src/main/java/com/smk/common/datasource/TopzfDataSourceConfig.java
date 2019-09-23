package com.smk.common.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2018/12/6 0006 14:19
 */
@Configuration
@MapperScan(basePackages = {"com.smk.mapper.topzf"}, sqlSessionFactoryRef = "topzfSqlSessionFactory")
public class TopzfDataSourceConfig {

	@Primary
	@Bean(name = "topzfDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.topzf")
	public DataSource dataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Resource
	private MybatisProperties properties;

	@Primary
	@Bean(name = "topzfSqlSessionFactory")
	public SqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
			sqlSessionFactoryBean.setMapperLocations(this.properties.resolveMapperLocations());
		}
		return sqlSessionFactoryBean;
	}

}
