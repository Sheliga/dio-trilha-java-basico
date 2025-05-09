import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador  {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
//        int parametroUm = terminal. ? ?;
        int parametroUm = 0
        System.out.println("Digite o segundo parâmetro");
//        int parametroDois = terminal. ? ?;
        int parametroDois = 0

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (? exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
    }
}