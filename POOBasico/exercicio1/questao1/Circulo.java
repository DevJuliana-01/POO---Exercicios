package POOBasico.exercicio1.questao1;


// Essa classe calcula a área e circunferência de um círculo.
public class Circulo {
    private double raio;

    //Construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;    }


    public double calculaArea(){
        return Math.PI * (Math.pow(raio, 2));
    }

    public double calculaCircunferencia(){
        return 2 * Math.PI * raio;
    }
}
