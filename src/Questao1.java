import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Questao1 {
    public static void main(String[] args) throws FileNotFoundException {
        Stack pilha = new Stack();
        Scanner scanner;

        scanner = new Scanner(new File("C:/Users/12111280/Desktop/Novo Documento de Texto.txt"));
        while (scanner.hasNextLine()) {
            pilha.push(scanner.nextLine());

        }
        for (int i =0;i<10;i++){
            System.out.println(pilha.pop());
        }
    }
}
