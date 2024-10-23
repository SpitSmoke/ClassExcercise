public class Carro {
// UM DIA SEREI UM GRANDE PROGRAMADOR XD

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeMaxima;


    public Carro(String marca, String modelo, int ano, String cor, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}
