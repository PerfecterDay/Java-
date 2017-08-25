package www.baidy.com;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC  ","root","root");
            String sql = "select * from users";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
            }


            //开始一个事务测试
            connection.setAutoCommit(false);
            sql = "UPDATE USERS SET age=26 WHERE ID=1";
            preparedStatement.execute(sql);
            connection.commit(); //提交事务，没有这句会失效
            try{
                resultSet.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
