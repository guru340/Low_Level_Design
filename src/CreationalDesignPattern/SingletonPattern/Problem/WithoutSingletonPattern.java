package CreationalDesignPattern.SingletonPattern.Problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSetting appSetting=new AppSetting();
        AppSetting appSetting1=new AppSetting();

        System.out.println(appSetting.getApikey());
        System.out.println(appSetting1.getApikey());

//        More Memory
        System.out.println(appSetting==appSetting1);
    }
}
