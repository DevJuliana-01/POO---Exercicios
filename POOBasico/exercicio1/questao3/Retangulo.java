package POOBasico.exercicio1.questao3;

//Classe com métodos para calcular a area e diagonal de um retângulo
//Verifica no construtor e setters se o valor fornecido é positivo 
public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Altura e base devem ser positivas"); // encerra o programa nesse ponto
        }
        this.base = base;
        this.altura = altura;
    }

    //getters
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }

    //setters
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    @Override
    public String toString() {
        return "Altura: " + this.altura + " Base: " + this.base; 
    }

    public double calcArea(){
        return base * altura;
    }
    public double calcDiagonal(){
        double potenciacao = (Math.pow(altura, 2))+(Math.pow(base, 2));
        return Math.sqrt(potenciacao);
    }
}
