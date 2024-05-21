public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        String meuNome = "Kelvim Tairan";
        System.out.println(meuNome);

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        double soma = 10.5 + 10.5;
        System.out.println(soma);
    }
}
