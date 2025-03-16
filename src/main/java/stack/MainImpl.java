package stack;

public class MainImpl {
    public static void main(String[] args) {
        StackImpl<String> s = new StackImpl<>();
        s.push("kishore");
        s.push("kishi");
        System.out.println(s);
    }
}
