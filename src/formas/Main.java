package formas;

public class Main {
    public static void main(String[] args) {
        /**
         * Criação de uma instância do objeto da Classe Circulo
         */
        Circulo bola = new Circulo();
        //como nao fiz um construtor, nao foi passada nenhuma cor, portanto o output = null
        bola.mostraCor();
        bola.trocaCor("Amarelo");
        bola.mostraCor();
    }
}