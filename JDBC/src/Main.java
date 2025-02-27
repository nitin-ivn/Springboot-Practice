import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String name = "postgres";
        String password = "database";

        int sid = 10;
        String sname = "lol";
        int marks = 94;
//        String query = "select * from student";
        String insert = "insert into student values (5,'John',87)";
        String update = "update student set sname = 'Max' where sid = 5";
        String delete = "delete from student where sid = 5";

        String insertDynamically = "insert into student values (?,?,?)";
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Connection established");

          //  Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while(rs.next()){
//                System.out.print(rs.getString("sid")+" ");
//                System.out.print(rs.getString(2)+" ");
//                System.out.print(rs.getString(3));
//            }
//            con.close();

            //st.execute(insert);
//            st.execute(update);
          //  st.execute(delete);

            PreparedStatement st = con.prepareStatement(insertDynamically);
            st.setInt(1,sid);
            st.setString(2,sname);
            st.setInt(3,marks);

            st.execute();


        }catch (Exception e){
            System.out.println("err" + e);
        }

    }
}