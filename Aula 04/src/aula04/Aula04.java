package aula04;
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("nic",0.4f, "amarelo");
        //c1.setModelo("BIC"); // usando metodo modificador
        //c1.modelo = "BIC"; // acessando diretamente o atributo, mas só se o atributo estiver como público
        //c1.setPonta(0.5f);
        //c1.setTampada(true); se eu quiser que seja destampada colo false como parâmetro
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de ponta " + c1.getPonta() + " e cor = " 
                + c1.getCor() + ". Ela esta tampada? " + c1.isTampada());
        //c1.status();
        Caneta c2 = new Caneta("hostnet",1.5f, "laranja");
        //c2.setTampada(true);
        // se quiser que tampada seja false, precisa chamar o método destampar, antes de chamar o método status
        c2.status();
/* para aparecer no console posso chamar na main com system out print ou posso criar metodo status() 
e chamar este método na main. c1 chamei por System.out.print e c2 chamei pelo metodo status()*/
    }
   
    
}