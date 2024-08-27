package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        //this.tampada = true; por padrão o java usa false, então se quiser que por padrão seja true, precisa explicitar isso aqui no método construtor.
    }
    

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo()); // pode chamar pelo método ou igual a linha abaixo chamar direto pelo atributo
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Ponta: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
}

