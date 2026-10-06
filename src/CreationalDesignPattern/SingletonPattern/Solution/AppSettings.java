package CreationalDesignPattern.SingletonPattern.Solution;

public class AppSettings {
//    step1:Make private static instance of the class
    private static AppSettings instance;
    private String databaseUrl;
    private String apikey;

//    Step2:Make the Constructor Private to prevent the direct object creation
    private AppSettings(){
//        Read setting from a config file
        databaseUrl="jdbc:mysql://localhost:3306/mydatabase";
        apikey="12345-ABCDE";
    }

//    Step3: Public static method to get the single instances


    public static AppSettings getInstance() {
        if (instance==null){
            instance=new AppSettings();
        }
        return instance;
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApikey(){
        return apikey;
    }
}
