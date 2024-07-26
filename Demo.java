package functionalprogramming;

public interface Demo {
    void sum(int a);

    public static void main(String[] args) {
        Demo a=(n)-> System.out.println(n+1);
        a.sum(10);
    }
}
