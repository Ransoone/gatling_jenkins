public class Sets {
    // Параметры Proxy
    public static String host = "localhost";
    public static Integer port = 8888;

    // Параметры Для запуска через гатлинг.

//    public static Integer ramp_stepOne = 10;
//    public static Integer ramp_stepTwo = 10;
//    public static Integer during_stepOne= 10;
//    public static Integer during_stepTwo= 10;//
//    public static double stepOne = 1;
//    public static double stepTwo = 2;


    //Параметры для Debug. Запуск через jenkins
    public static Integer ramp_stepOne = Integer.valueOf(System.getenv("ramp_stepOne"));
    public static Integer ramp_stepTwo = Integer.valueOf(System.getenv("ramp_stepTwo"));
    public static Integer during_stepOne = Integer.valueOf(System.getenv("during_stepOne"));
    public static Integer during_stepTwo = Integer.valueOf(System.getenv("during_stepTwo"));
    public static double stepOne = Double.valueOf(System.getenv("stepOne"));
    public static double stepTwo = Double.valueOf(System.getenv("stepTwo"));

    //Параметры для DebugIncrementUserPerSec. Запуск через jenkins
    public static double incrementUsersPerSec = Double.valueOf(System.getenv("incrementUsersPerSec"));
    public static Integer times = Integer.valueOf(System.getenv("times"));
    public static Integer eachLevelLasting = Integer.valueOf(System.getenv("eachLevelLasting"));
    public static Integer separatedByRampsLasting = Integer.valueOf(System.getenv("separatedByRampsLasting"));
    public static double startingFrom = Double.valueOf(System.getenv("startingFrom"));



}
