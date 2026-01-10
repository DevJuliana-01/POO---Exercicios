package POOBasico.exercicio2.questao1;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Compromisso> comps;
    private int k;   //quantidade de compromissos

    public Agenda(){
        comps = new ArrayList<>();
        k = 0;
    }
    public int getQtd (){
        return k;     //retona quantidade de compromissos
    }

    public void inserir(Compromisso c){
        comps.add(c);
        k++;
    }

    public  void excluir(Compromisso c){
       if (comps.remove(c)) {
            k--; 
        }
    }

    public Compromisso[] listar(){
        return comps.toArray(new Compromisso[0]); //copia os elementos de comps para um vetor
    }

    public Compromisso[] pesquisar(int mes, int ano){
    // conta quantos compromissos são válidos
    int validos = 0;
    for (int i = 0; i < k; i++) {
        Compromisso c = comps.get(i);
        if (c.getData().getMonthValue() == mes &&
            c.getData().getYear() == ano) {
            validos++;
        }
    }

    // cria um vetor para armazenar os eventos válidos
    Compromisso[] resultado = new Compromisso[validos];

    //preenchendo o vetor resultado com todos os eventos válidos
    int cont = 0;
    for (int i = 0; i < k; i++) {
        Compromisso c = comps.get(i);
        if (c.getData().getMonthValue() == mes &&
            c.getData().getYear() == ano) {
            resultado[cont] = c;
            cont++;
        }
    }
    return resultado;
}

}