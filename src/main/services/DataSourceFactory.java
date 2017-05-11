package main.services;

//import org.postgresql.ds.PGPoolingDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class DataSourceFactory {

    /**
     * Get an object DataSource for connection to DB
     * @return dataSource
     */
//    public static DataSource getMyPGDataSource() {
//        PGPoolingDataSource source = new PGPoolingDataSource();
//        source.setDataSourceName("SDB");
//        source.setServerName("localhost");
//        source.setDatabaseName("students");
//        source.setUser("postgres");
//        source.setPassword("123456");
//        source.setMaxConnections(10);
//        return source;
//    }

    private static DataSource datasource = new DataSource();
    static {
        PoolProperties p = new PoolProperties();
        p.setUrl("jdbc:postgresql://localhost:5432/postgres");
        p.setDriverClassName("org.postgresql.Driver");
        p.setUsername("postgres");
        p.setPassword("1234");
        p.setJmxEnabled(true);
        p.setTestWhileIdle(false);
        p.setTestOnBorrow(true);
        p.setValidationQuery("SELECT 1");
        p.setTestOnReturn(false);
        p.setValidationInterval(30000);
        p.setTimeBetweenEvictionRunsMillis(30000);
        p.setMaxActive(100);
        p.setInitialSize(10);
        p.setMaxWait(10000);
        p.setRemoveAbandonedTimeout(60);
        p.setMinEvictableIdleTimeMillis(30000);
        p.setMinIdle(10);
        p.setLogAbandoned(true);
        p.setRemoveAbandoned(true);
        p.setJdbcInterceptors(
                "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+
                        "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");

        datasource.setPoolProperties(p);
    }

    /**
     * Get an object DataSource for connection to DB
     * @return dataSource
     */
    public static DataSource getDataSource() {
        return datasource;
    }

}
