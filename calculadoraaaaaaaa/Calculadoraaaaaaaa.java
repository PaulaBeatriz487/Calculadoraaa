
package calculadoraaaaaaaa;

import javax.swing.JOptionPane;

//Desenvolvido por João Leonardo Neves Valdez e Paula Beatriz Reis Nunes

public class Calculadoraaaaaaaa {

   
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "1.Soma | 2.Subtrair | 3.Multiplicar | 4.Dividir",
                "Escolha uma Opção:", JOptionPane.PLAIN_MESSAGE);
        
        String op =
            JOptionPane.showInputDialog("Digite a operação desejada");
        
        String a =
          JOptionPane.showInputDialog(" digite um número");   
        String b =
          JOptionPane.showInputDialog(" digite um número");
        
        int op1 = Integer.parseInt(op);
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        
	switch (op1) {
            case 1:
		JOptionPane.showMessageDialog(null, operation.somar(a1, b1),
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
		break;
            case 2:
		JOptionPane.showMessageDialog(null, operation.subtrair(a1, b1),
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
		break;
            case 3:
		JOptionPane.showMessageDialog(null, operation.multiplicar(a1, b1),
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
		break;
            case 4:
		JOptionPane.showMessageDialog(null, operation.dividir(a1, b1),
                    "Resultado", JOptionPane.PLAIN_MESSAGE);
		break;
            default:
                JOptionPane.showMessageDialog(null, "Operação Invalida",
                    "Erro", JOptionPane.PLAIN_MESSAGE);
	}  
    }  
}
