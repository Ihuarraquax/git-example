package pl.mpas.gitspring.lambda;

//
@FunctionalInterface
public interface Formating {
    String format(String name, String surname, int age);
    default void test() {}
}
