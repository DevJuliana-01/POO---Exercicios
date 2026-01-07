package POOBasico.exercicio1;

// classe com métodos para calcular a média parcial(com as notas bimestrais) e a média final(com todas as notas, caso o aluno tenha ficado na prova final)
// média parcial ponderada com pesos 2 e 3
// média final como a média aritmética da média parcial com a nota da prova final, caso o aluno não seja aprovado por média.
// média : 60
public class Disciplina {
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private double provaFinal;

    public Disciplina(String nome, double nota1, double nota2, double provaFinal){
        this.nomeDisciplina = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.provaFinal = provaFinal;
    }

    //getters
    public String getNome(){
        return this.nomeDisciplina;
    }
    public double getNota1(){
        return this.nota1;
    }
    public double getNota2(){
        return this.nota2;
    }
    public double getProvaFinal(){
        return this.provaFinal;
    }

    //setters
    public void setNome(String nome){
        this.nomeDisciplina = nome;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public void setProvaFinal(double provaFinal){
        this.provaFinal = provaFinal;
    }


    public double mediaParcial(){
        return ((nota1*2) + (nota2*3))/5;
    }

    public double mediaFinal (){
        double media = mediaParcial();
        if (media < 60.0){
            return (media + provaFinal)/2;
        }
        else{
            return media;
        }
    }
}
