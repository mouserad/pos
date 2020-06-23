package Jdbc.companydb;

import java.sql.*;
import java.util.ArrayList;

public class CompanyDBExample {

    public static void showEMP() {

        String url = "jdbc:hsqldb:file:c:\\HSQLDB\\CompanyDB\\companydb;shutdown=true";

        try (Connection con = DriverManager.getConnection(url, "db", "");
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next())
                System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s%n",
                        rs.getInt("EMPNO"),
                        rs.getString("ENAME"),
                        rs.getString("JOB"),
                        rs.getInt("MGR"),
                        rs.getDate("HIREDATE"),
                        rs.getDouble("SAL"),
                        rs.getDouble("COMM"),
                        rs.getInt("DEPTNO"));

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showDeptsWithEmployees(){

        ArrayList<Person> personArrayList = createPersonArrayList();

        String url = "jdbc:hsqldb:file:c:\\HSQLDB\\CompanyDB\\companydb;shutdown=true";

        try (Connection con = DriverManager.getConnection(url, "db", "");
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from dept");

            while (rs.next()){
                System.out.printf("%s, %s%n",
                        rs.getString("DNAME"),
                        rs.getString("LOC"));
                for (Person person : personArrayList) {
                    if(rs.getInt("DEPTNO") == person.getDeptno()){
                        System.out.println("   - "+person.getEmpno()+", "+person.getEname()+", "+person.getJob());
                    }
                }
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Person> createPersonArrayList(){

        ArrayList<Person> personArrayList = new ArrayList<>();

        String url = "jdbc:hsqldb:file:c:\\HSQLDB\\CompanyDB\\companydb;shutdown=true";

        try (Connection con = DriverManager.getConnection(url, "db", "");
             Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next()){
                Person person = new Person();
                person.setEmpno(rs.getInt("EMPNO"));
                person.setEname(rs.getString("ENAME"));
                person.setJob(rs.getString("JOB"));
                person.setMgr(rs.getInt("MGR"));
                person.setHiredate(rs.getDate("HIREDATE"));
                person.setSal(rs.getDouble("SAL"));
                person.setComm(rs.getDouble("COMM"));
                person.setDeptno(rs.getInt("DEPTNO"));

                personArrayList.add(person);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personArrayList;
    }

    public static void main(String[] args) {
        showEMP();
        System.out.println("");
        showDeptsWithEmployees();
    }


}
