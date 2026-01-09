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
        return comps.toArray(new Compromisso[0]);
    }
}
