import java.util.InputMismatchException;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {

        try (Scanner terminal = new Scanner(System.in)) {
            //leitura do primeiro parametro
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            //leitura do segundo parametro
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();


            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("Parametros inválidos");
            System.err.println(exception.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Você deve digitar apenas números inteiros.");


        } catch (Exception e) {
            // tratar qualquer outra exceção inesperada
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Execução finalizada");


        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro!");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}