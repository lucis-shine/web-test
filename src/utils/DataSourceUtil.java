package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接池  c3p0
 */
public class DataSourceUtil {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    /**
     * 获取Connection连接
     * @return
     */
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
        System.out.println(connection);
    }

}
