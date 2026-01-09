package POOBasico.exercicio2.questao1;

import java.time.LocalDateTime;

public class Compromisso {
    private String assunto;
    private String local;
    private LocalDateTime data;

    public Compromisso(String assunto, String local, LocalDateTime data){
        this.assunto = assunto;
        this.local = local;
        this.data = data;
    }

    //setters
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    //getters
    public String getAssunto() {
        return assunto;
    }
    public String getLocal() {
        return local;
    }
    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Assunto: " + assunto + " Local: " + local + " Data: " + data;
    }
}
