public class MyClass {

    private static String str1;
    private static String str2;
    private static boolean bool1;
    private static boolean bool2;
    private static boolean bool3;

    public static void initializeAndPrint(String s1, String s2, boolean b1, boolean b2, boolean b3) {
        str1 = s1;
        str2 = s2;
        bool1 = b1;
        bool2 = b2;
        bool3 = b3;
        
        System.out.println("Initialized values:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
    }

    // Example of using the static method
    public static void main(String[] args) {
        initializeAndPrint("Hello", "World", true, false, true);
    }
}
