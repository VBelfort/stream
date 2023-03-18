package sistemastream;

public class Video{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0; 
        this.reproduzindo=false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova=this.avaliacao+avaliacao;
        //nova=(int)((this.avaliacao+avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Video{"+"titulo="+titulo+", avaliacao="+avaliacao+", views="
        +views+", curtidas="+curtidas+", reproduzindo="+reproduzindo+"}";
    }
}
