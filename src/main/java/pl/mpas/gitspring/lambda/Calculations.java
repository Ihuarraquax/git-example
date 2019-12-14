package pl.mpas.gitspring.lambda;

public interface Calculations {

    int calc(int a, int b);
    default void test() {}
}

// TODO
// String (imie, nazwisko, wiek)
// imie:nazwisko - w wieku: x
class Additions implements Calculations {

    @Override
    public int calc(int aha, int b) {
        return aha + b;
    }

    @Override
    public void test() {

    }
}