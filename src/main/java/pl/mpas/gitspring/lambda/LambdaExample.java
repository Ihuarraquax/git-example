package pl.mpas.gitspring.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        // dodawanie
        System.out.println(performCalculations(1, 2,
                new Additions()));

        // mnożenie
        System.out.println(performCalculations(3, 2,
                new Calculations() {
                    @Override
                    public int calc(int a, int b) {
                        return a * b;
                    }

                    @Override
                    public void test() {

                    }
                }));

        System.out.println(performCalculations(5, 6,
                (a, b) -> a - b));
//        var a = 5;
//        a = "hahaha";
//        var list = new ArrayList()<>;

        Formating formating = (imie, nazwisko, wiek) ->
                imie + ":" + nazwisko + " w wieku: " + wiek;
    }
    private static int performCalculations(int first,
                                           int second,
                                           Calculations calculations){
        return calculations.calc(first, second);
    }
}
