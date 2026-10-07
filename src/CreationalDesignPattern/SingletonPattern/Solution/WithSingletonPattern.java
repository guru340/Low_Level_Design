package CreationalDesignPattern.SingletonPattern.Solution;

import CreationalDesignPattern.SingletonPattern.Problem.AppSetting;

public class WithSingletonPattern {

    public static void main(String[] args) {

        AppSettings appSetting=AppSettings.getInstance();
        AppSettings appSetting1=AppSettings.getInstance();

        System.out.println(appSetting.getApikey());
        System.out.println(appSetting1.getApikey());

        System.out.println(appSetting==appSetting1);
    }
}
