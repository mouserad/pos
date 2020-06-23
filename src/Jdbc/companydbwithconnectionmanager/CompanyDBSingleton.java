package Jdbc.companydbwithconnectionmanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompanyDBSingleton {

    private static Connection con = null;

    public CompanyDBSingleton() throws SQLException {
        makeConnection();
    }

    public static void makeConnection() throws SQLException {
        con = ConnectionManager.getInstance().getConnection();
    }

    public void showEMP(Connection con) {

        try (Statement stmt = con.createStatement()) {

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

    public void showDeptsWithEmployees(Connection con) {

        try (Statement stmt = con.createStatement()) {

            ArrayList<Person> personArrayList = createPersonArrayList(con);
            ResultSet rs = stmt.executeQuery("select * from dept");

            while (rs.next()) {
                System.out.printf("%s, %s%n",
                        rs.getString("DNAME"),
                        rs.getString("LOC"));
                for (Person person : personArrayList) {
                    if (rs.getInt("DEPTNO") == person.getDeptno()) {
                        System.out.println("   - " + person.getEmpno() + ", " + person.getEname() + ", " + person.getJob());
                    }
                }
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> createPersonArrayList(Connection con) {

        ArrayList<Person> personArrayList = new ArrayList<>();

        try (Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next()) {
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

    public static void main(String[] args) throws SQLException {
        CompanyDBSingleton company = new CompanyDBSingleton();
        company.showEMP(con);
        company.showDeptsWithEmployees(con);
    }

}
