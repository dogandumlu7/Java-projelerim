class A {
    void f() { System.out.println("Af"); }
    void f(String s) { f(1,s); }
    void f(String s, int n) { System.out.println("Afsn: " + s+ n ); }
    void f(int n, String s) { System.out.println("Afns: " + n + s); }
    void f(int n) { System.out.println("Afn: " + n); }
}

class B extends A {
    void f(int n) { System.out.println("Bfn: " + n); }
    void f(String s, int n) { System.out.println("Bfsn: " + s + n); }
    void f(String s) { f(11,s); }
}

class C extends B {
    void f(int n, String s) { System.out.println("Cfns: " + n + s); }
    void f(int n) { f("merhaba", n); }
}





public class Metotlar {
    public static void main(String[] args) {
        B b = new B();
        b.f();
        b.f(17);

        A c = new C();
        c.f("selam");
        c.f(332);
        c.f(17, "soru");
        c.f("cevap", 42);

    }

}
