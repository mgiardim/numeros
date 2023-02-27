import javax.swing.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            String numeros = JOptionPane.showInputDialog(null, "Digite um numero:");
            String texto = "";
            Integer numerosB = Integer.parseInt(numeros);
            if(numerosB > 0){
                texto = texto + "+";
            }
            else{
                texto = texto + "-";
            }
            if(numerosB < 1000){
                System.out.println(numerosB);
            }
            else{
                //trunca o valor
                int contador = 0;
                Double auxiliar = Math.floor((numerosB/100)*100);
                System.out.println(auxiliar);
                //mede a quantidade de K
                while (auxiliar/1000 >= 1){
                    auxiliar = auxiliar/1000;
                    contador = contador + 1;
                }
                String numeroConvertido = Double.toString(auxiliar);
                for (int x = 0; x < contador; x++) {
                    numeroConvertido = numeroConvertido.concat("k");
                }
                System.out.println(numerosB +" = "+numeroConvertido);
            }
            // validar regex
//            Pattern padrao = Pattern.compile("\\+?[0-9]{1,21}|-?[0-9]{1,21}");
//            Matcher validador = padrao.matcher(numeros);
//            boolean verificado = validador.matches();
//            char[] separador = numeros.toCharArray();
//            int tamanho = separador.length;
//            boolean categorizacao = false;
//            HashMap<Integer,Character> numerais = new HashMap<Integer,Character>();
//            HashMap<Integer,String> unidades = new HashMap<Integer,String>();
//            do{
//                unidades.put(0,"Unidade");
//                unidades.put(1,"Dezena/as");
//                unidades.put(2,"Centena/as");
//                unidades.put(3,"Milhar/res");
//                unidades.put(4,"Dezena/as de Milhar");
//                unidades.put(5,"Centena/as de Milhar");
//                unidades.put(6,"Milhao/oes");
//                unidades.put(7,"Dezena/as de Milhao");
//                unidades.put(8,"Centena/as de Milhao");
//                unidades.put(9,"Bilhao/oes");
//                unidades.put(10,"Dezena/as de Bilhao");
//                unidades.put(11,"Centena/as de Bilhao");
//                unidades.put(12,"Trilhao/oes");
//                unidades.put(13,"Dezena/as de Trilhao");
//                unidades.put(14,"Centena/as de Trilhao");
//                unidades.put(15,"Quatrilhao/oes");
//                unidades.put(16,"Dezena/as de Quatrilhao");
//                unidades.put(17,"Centena/as de Quatrilhao");
//                unidades.put(18,"Quintilhão/oes");
//                unidades.put(19,"Dezena/as de Quintilhão");
//                unidades.put(20,"Centena/as de Quintilhão");
//                categorizacao = true;
//            }while(categorizacao == false);
//            if(Character.toString(separador[0]).equals("-")){
//                for(int leitor = 0; leitor < tamanho;leitor++){
//                    numerais.put(leitor,separador[leitor]);
//                }
//            }
//            else if(Character.toString(separador[0]).equals("+")){
//                for(int leitor = 0; leitor < tamanho;leitor++){
//                    numerais.put(leitor,separador[leitor]);
//                }
//            }
//            else{
//                numerais.put(0,'+');
//                for(int leitor = 1; leitor <= tamanho;leitor++){
//                    numerais.put(leitor,separador[leitor-1]);
//                    JOptionPane.showMessageDialog(null,"Tamanho = "+tamanho);
//                    JOptionPane.showMessageDialog(null,"Leitor = "+leitor);
//                }
//            }
//            JOptionPane.showMessageDialog(null,"Tamanho = "+separador.length);
//            JOptionPane.showMessageDialog(null,"1 = "+separador[0]);
//        }catch (NumberFormatException exception){
//            JOptionPane.showMessageDialog(null,"Erro.Campo aceita somente numeros"+ exception);
        }
        catch (Exception e){

        }
    }
}