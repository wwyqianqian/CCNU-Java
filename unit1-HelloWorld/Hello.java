public class Hello {
    public static void main (String args[]) {
        System.out.println("这是一个简单的 Java 程序");
        Student stu = new Student();
        stu.speak("We are students");
    }
}
class Student {
    public void speak(String s) {
        System.out.println(s);
    }
}

// javac Hello.java
// java Hello
