package carro_de_corrida;

public class App {
    public static void main(String[] args){
    App aplicacao = new App();
    pessoa plt = new pessoa("Rodrigo");
    piloto plt1 = new piloto("Ayrton Senna");
    System.out.println(plt.mostrarNome);
    System.out.println(plt1.mostrarNome);
    
    veiculo v1 = new veiculo("Toyota");
    carro cr1 = new carro("Fusca");
    System.out.println(v1.mostrarVeiculo());
    System.out.println(cr1.mostrarVeiculo());
    }
}