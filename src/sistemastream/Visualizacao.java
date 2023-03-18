package sistemastream;

public class Visualizacao {
    private Usuario espectador;
    private Video filme;
    
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews()+1);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        if(this.espectador.getTotAssistido()>4){
            this.espectador.experiencia=10f;
            System.out.println("Parabéns. Sua experiência aumentou!");
        }
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot=0;
        if(porc<=20){
            this.filme.setAvaliacao(3);
        }else if(porc<=50){
            this.filme.setAvaliacao(5);
        }else if(porc<=90){
            this.filme.setAvaliacao(8);
        }else {
            this.filme.setAvaliacao(10);
        }
    }

    public void play() {
        this.filme.setReproduzindo(true);
    }

    public void pause() {
        this.filme.setReproduzindo(false);
    }
    
    public void like() {
        //this.curtidas++;
        this.filme.setCurtidas(this.filme.getCurtidas()+1);
    }
    
    public Usuario getEspectador() {
        return espectador;
    }
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ",\n\nfilme="
        + filme + "]";
    }
}
