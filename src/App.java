import sistemastream.*;
public class App {
    public static void main(String[] args) throws Exception {
        Video v[]=new Video[3];
        v[0]=new Video("Aula 1 de POO");
        v[1]=new Video("Aula 12 de PHP");
        v[2]=new Video("Aula 20 de HTML 5");
        Usuario g[]=new Usuario[2];
        g[0]=new Usuario("Gustavo", 22, "M", "Gusta");
        g[1]=new Usuario("Ana", 12, "F", "Aninha");
        Visualizacao vis[]=new Visualizacao[10];
        vis[0]=new Visualizacao(g[0], v[0]);

        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println("------------------------");
        vis[1]=new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        vis[1].avaliar(5);
        System.out.println(vis[1].toString());
        System.out.println("------------------------");
        vis[2]=new Visualizacao(g[0], v[2]);
        vis[2].avaliar(1);
        vis[2].avaliar(3);
        System.out.println(vis[2].toString());
        System.out.println("------------------------\n");
        vis[3]=new Visualizacao(g[0], v[2]);
        vis[3].avaliar(65);
        System.out.println(vis[3].toString());
        System.out.println("------------------------\n");
        vis[4]=new Visualizacao(g[0], v[2]);
        vis[4].avaliar(78);
        vis[4].like();
        vis[4].like();
        //v[2].like();
        //v[2].like();
        System.out.println(vis[4].toString());
    }
}
