
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número:"));

            String[] opcoes = {"+", "-", "x", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma operação:",
                    "Calculadora Simples",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            double resultado = 0;
            switch (escolha) {
                case 0: resultado = num1 + num2; break;
                case 1: resultado = num1 - num2; break;
                case 2: resultado = num1 * num2; break;
                case 3:
                    if (num2 == 0) throw new ArithmeticException("Divisão por zero!");
                    resultado = num1 / num2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma operação escolhida.");
                    return;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
