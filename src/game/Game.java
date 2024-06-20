package game;
import java.util.Scanner;
public class Game {

    
public static void main(String[] args) {
    

        Scanner scanner = new Scanner(System.in);

        // Criação um Mago
        System.out.print("Digite o nome do Mago: ");
        String nomeMago = scanner.nextLine();
        System.out.print("Digite a vida do Mago: ");
        int vidaMago = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        Mago mago = new Mago(nomeMago, vidaMago);

        // itens e poderes ao Mago
        mago.adicionarItem (new Item("Poção de Cura", 40));
        mago.adicionarItem (new Item("Poção de velocidade", 20));
        mago.adicionarItem (new Item("Armadura de aço", 50));
        mago.adicionarPoder(new Poder("Receba a inteligência"));
        mago.adicionarPoder(new Poder("Raio"));
        mago.adicionarPoder(new Poder("Voar"));
        mago.adicionarPoder(new Poder("Regeneração"));
        mago.adicionarPoder(new Poder("Invisibilidade"));
        mago.adicionarPoder(new Poder("Cajado do mal"));
        
        // Mostrando status inicial do Mago
        System.out.println("\nStatus inicial:");
        mago.mostrarStatus();

        // selecionar um item
        System.out.println("\nEscolha um item para te ajudar nessa trajetória:");
        mago.mostrarInventario();
        int escolhaItem = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        mago.usarItem(escolhaItem);

        // Usando poder que preferir
        System.out.println("\nEscolha um poder para usar, escolha com sabedoria:");
        mago.mostrarPoderes();
        int escolhaPoder = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro
        mago.usarPoder(escolhaPoder);

        scanner.close();
    }
}  
    
        

    

