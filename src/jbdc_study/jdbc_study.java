package jbdc_study;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc_study {

    public static final String url = "jdbc:mysql://localhost:3306/java_study";
    public static final String user = "root";
    public static final String password = "123456";

    public static Statement stmt;

    public static Connection conn;


    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,password);
        stmt = conn.createStatement();

//插入数据
//1.插入如下数据
//('s001','老大',20,'计算机学院')
//('s002','老二',19,'计算机学院')
//('s003','老三',18,'计算机学院')
//('s004','老四',17,'计算机学院')
        insert();
//遍历输出到控制台
//2.查看表中的所有信息，遍历输出到控制台
    List<student> students = getAll();

        for (student i : students
             ) {
            System.out.println(i.Age+","+i.College+","+i.Name+","+i.SNO);
        }
//删除s004
//3.把sno为s004的记录删除
        delete();


//查找
//4.查询sno为s003的记录
        student s = getIF("s003");

        System.out.println(s.Age+","+s.College+","+s.Name+","+s.SNO);

//更新数据
//5.把sno为s001的记录修改为('s001','老大',20,'通信学院')
        update();
    }

    public static void insert() {
        try {
            stmt.execute("insert into students (SNO,Name,Age,College) values" +
                    " ('s001','老大',29,'计算机学院')," +
                    "('s002','老二',19,'计算机学院')," +
                    "('s003','老三',18,'计算机学院')," +
                    "('s004','老八',100,'计算机学院')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("插入成功");
    }

    public static List<student> getAll() {
        ResultSet rs;
        try {
            rs = stmt.executeQuery("select * from students");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        List<student> students = new ArrayList<student>();
        student student ;
       try {
           while (rs.next()) {
               student = new student();

               student.SNO = rs.getString("SNO");
               student.Age = rs.getInt("Age");
               student.Name = rs.getString("Name");
               student.College =rs.getString("College");

               students.add(student);
           }
       }catch (SQLException e) {
           throw new RuntimeException(e);
       }
        System.out.println("查询成功");
        return students;


    }

    public static void delete(){
        try {
            stmt.execute("delete from students where SNO = 's004'");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("删除成功");
    }

    public static student getIF(String SNO) {
        ResultSet result;
        String sqlStr = "select * from students where SNO = ?" ;
        try {
            PreparedStatement ptmt = conn.prepareStatement(sqlStr);
            ptmt.setString(1,SNO);
            result = ptmt.executeQuery();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
       student s = new student();
        try {
          if (result.next()){
              s.Age = result.getInt("Age");
              s.SNO = result.getString("SNO");
              s.Name = result.getString("Name");
              s.College =result.getString("College");
          }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("查找成功");
        return s;

    }

    public static void update() {
        try{
            stmt.executeUpdate("update students set College = '通信学院' where SNO = 's001'");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }



}

class student {
    public String SNO ;
    public String Name;
    public String College;
    public Integer Age;

}


