package aulacontrolerem;

public class AulaControleRem {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //c.ligar(); //contrutor começou o objeto como ligar = true, então não preciso chamar metodo ligar
        //c.desligar(); // apenas para testar o que acontece se eu desligar antes de querer aumentar, dar play e mostrar menu
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
      
    }
    
}