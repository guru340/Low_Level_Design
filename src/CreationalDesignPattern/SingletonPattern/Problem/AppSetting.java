package CreationalDesignPattern.SingletonPattern.Problem;

public class AppSetting {
    private String databaseUrl;
    private String apikey;

    public AppSetting(){
//        Read setting from a config file
        databaseUrl="jdbc:mysql://localhost:3306/mydatabase";
        apikey="12345-ABCDE";
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApikey(){
        return apikey;
    }
}
