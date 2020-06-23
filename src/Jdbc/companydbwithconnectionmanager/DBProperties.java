package Jdbc.companydbwithconnectionmanager;

public final class DBProperties {

    private volatile static DBProperties properties = null;

    public synchronized static DBProperties getInstance() {
        if (properties == null)
            properties = new DBProperties();
        return properties;
    }

    public String getStringProperty(String choice){
        switch (choice){
            case "user":
                return "db";
            case "pwd":
                return "";
            case "dbDriver":
                return "org.hsqldb.jdbcDriver";
            case "dbUrl":
                return "jdbc:hsqldb:file:c:\\HSQLDB\\CompanyDB\\companydb;shutdown=true;ifexists=true";
            default:
                return choice;
        }
    }

}
