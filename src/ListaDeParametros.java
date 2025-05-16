import javax.swing.JOptionPane;

public class ListaDeParametros {   

    public static void main(String[] args) { 

        int x = 2, y = 3;
        soma(x, y);
    }

    public static void soma(int a, int b) { 
        System.out.println ("Terminando a execução do programa.");

        int resultado = a + b;
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    class Professor { 

    	 private int matricula;
    	 private String primeiroNome;
    	 private String sobrenome;
    	 private String endereco;
    	 private int idade;
    	 private String rg;
    	 private String cpf;
    	 private char sexo;
    	 
    	}

}