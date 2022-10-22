package formas;

public class Retangulo {

    private float ladoA;
    private float ladoB;
    private float area;
    private float perimetro;

    public Retangulo(float ladoA, float ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        area = calculaArea();
        perimetro = calculaPerimetro();

    }

    public void setLadoA(float novoLadoA){
        if (novoLadoA > 0.0f){
            ladoA = novoLadoA;
        }
    }
    public void setLadoB(float novoLadoB){
        if (novoLadoB > 0.0f){
            ladoB = novoLadoB;
        }
    }
    public void getLados(){
        System.out.println("lado A: "+ladoA);
        System.out.println("lado B: "+ladoB);
    }


    public float calculaArea (){
        return (ladoA*ladoB);
    }
    public float getArea(){
        return area;
    }
    public float calculaPerimetro(){
        return  ((2*ladoA)+(2*ladoB));
    }
    public float getPerimetro(){
        return perimetro;
    }


}
