package formas;

public class Quadrado {

    private float lado;
    private float area;

    public Quadrado(float lado){
        this.lado = lado;
    }

    public void mudaLado(float novoLado){
        if (novoLado >= 0.00f){
            lado = novoLado;
        }
    }
    public void mostraLado(){
        System.out.println(lado);
    }
    public float calculaArea(){
        area = lado*lado;
        return area;
    }

}
