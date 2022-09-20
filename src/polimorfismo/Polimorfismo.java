package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

//        System.out.println("Resultado: " + (calc.somar(2, 3, 6)));
//        System.out.println("Resultado: " + (calc.somar(2, 5)));
//        System.out.println("Resultado: " + (calc.somar(9, 5)));
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();

        gato.comunicar();
        cachorro.comunicar();
        pato.comunicar();
    }

}
