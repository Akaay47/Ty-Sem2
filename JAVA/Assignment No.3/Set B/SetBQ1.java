import java.io.*;
import java.sql.*;
import java.util.*;

public class SetBQ1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // load a driver
          //  Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn= DriverManager.getConnection("jdbc:postgresql://192.168.1.254:5432/ty21","ty21","ty21");

            Scanner sc = new Scanner(System.in);
            System.out.println("\n\tMobile Information\n");
            do {
                System.out.println("\n\t1.Insert \n\t2.Modify\n\t3.Delete\n\t4.Search \n\t5.View All\n\t6.Exit\n");
                System.out.println("Enter Your Choice: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        pstmt = conn.prepareStatement("insert into mobile values(?,?,?,?,?,?,?,?,?)");

                        System.out.println("Enter Model_Number: ");
                        int mno = sc.nextInt();
                        pstmt.setInt(1, mno);

                        sc.nextLine();
                        System.out.println("Enter Model_Name: ");
                        String name = sc.nextLine();
                        pstmt.setString(2, name);

                        System.out.println("Enter Model_Color: ");
                        String color = sc.nextLine();
                        pstmt.setString(3, color);

                        System.out.println("Enter Sim_Type: ");
                        String sim = sc.nextLine();
                        pstmt.setString(4, sim);
                        

                        System.out.println("Enter Network_Type: ");
                        String pr = sc.nextLine();
                        pstmt.setString(5, pr);


                        System.out.println("Enter Battery Capacity: ");
                        int Battery = sc.nextInt();
                        pstmt.setInt(6, Battery);

                        System.out.println("Enter Internal Storage In GB: ");
                        int internal = sc.nextInt();
                        pstmt.setInt(7, internal);

                        System.out.println("Enter RAM In GB: ");
                        int ram = sc.nextInt();
                        pstmt.setInt(8, ram);

                        sc.nextLine();
                        System.out.println("Enter Processor_Type: ");
                        String pk = sc.nextLine();
                        pstmt.setString(9, pk);

                        int result = pstmt.executeUpdate();
                        System.out.println(result + " Record Inserted\n");
                        break;

                    case 2:
                        /*String SQL = "update mobile set mdn=? where mnum=?";
                        pstmt = conn.prepareStatement(SQL);
                        pstmt = conn.prepareStatement("update mobile set mdn=? where mnum=?");*/
                        Statement st = conn.createStatement();

                        System.out.println("Enter Model c for Update Record: ");
                        String no = sc.next();
                      //  pstmt.setInt(1, no);

                        sc.nextLine();
                        System.out.println("Enter Updated Model name: ");
                        String mname = sc.nextLine();
                       // pstmt.setString(2, mname);

                        int re = st.executeUpdate("update mobile  set mdn='mname' where mdc='no' ");
                        System.out.println(re + " Record Updated\n");
                        break;

                    case 3:
                        pstmt = conn.prepareStatement("delete from mobile where mid=?");
                        System.out.println("Enter Model No for Delete Record: ");
                        int model = sc.nextInt();
                        pstmt.setInt(1, model);

                        int result3 = pstmt.executeUpdate();
                        System.out.println(result3 + " Record Deleted\n");
                        break;

                    case 4:
                        pstmt = conn.prepareStatement("select * from mobile where mid=?");
                        System.out.println("Enter Model No for serach Record: ");
                        int m = sc.nextInt();

                        pstmt.setInt(1, m);

                        rs = pstmt.executeQuery();
                        System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                         while (rs.next()) {
                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                                    + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7)
                                    + "\t" + rs.getInt(8) +"\t" + rs.getString(9));
                        }System.out.println("------------------------------------------------------------------------------------------------------------------");
                        break;

                    case 5:
                        stmt = conn.createStatement();
                        rs = stmt.executeQuery("select * from mobile");
            			System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                                    + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7)
                                    + "\t" + rs.getInt(8) +"\t" + rs.getString(9));
                        }
            			System.out.println("------------------------------------------------------------------------------------------------------------------");

                        break;

                    case 6:
                        System.exit(1);
                        rs.close();
                        stmt.close();
                        pstmt.close();
                        conn.close();
                        sc.close();
                }

            } while (true);

        } // try
        catch (Exception e) {
            System.out.println(e);
        } // catch
    }// main
}// class
