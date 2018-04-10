package edu.ifpb.jwt;

/**
 * @author lyndemberg
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Token token = new Token();
        String gerado = token.create("chico@gmail.com", 1);
        
        System.out.println(gerado);
        
        boolean resultadoAntes = token.validarToken(gerado);
        System.out.println("Validação: "+ resultadoAntes);
        
        
        System.out.println("Dormindo......");
        //dormir por um minuto
        Thread.sleep(60000);
        
        boolean resultadoDepois = token.validarToken(gerado);
        System.out.println("Validação: "+ resultadoDepois);

    }
}
