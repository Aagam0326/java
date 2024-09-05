class Q_1 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        method1();
    }

    public static void method1() {
        System.out.println("Method 1 via Main Method");
    }

    void method2() {
        System.out.println("Method 2 via Class Method");
    }
}

class q{
    public static void main(String[] args) {
        Q_1 obj = new Q_1();
        obj.method2();
    }
}

class Q_2 {
    static String a = "Static Variable";
    public static void method() {
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        System.out.println("Static Method:");
        System.out.println("a = " + a);
        method();
    }
}

class Q_3 {
    static {
        System.out.println("Static Block Before Main Method");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");

    }
    static { 
        System.out.println("Static Block After Main Method"); 
    }
}
