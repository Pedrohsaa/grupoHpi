package com.bazarsarah.sistema;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class configuracaoBancoDeDados {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Driver MySQL
        dataSource.setUrl("jdbc:mysql://localhost:3306/loja?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("root"); // usuário padrão do MySQL
        dataSource.setPassword("1234"); // coloque sua senha
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL); // Define MySQL
        adapter.setShowSql(true); // Mostra SQL no console
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect"); // Dialeto do MySQL 8+
        adapter.setPrepareConnection(true);
        return adapter;
    }
}
