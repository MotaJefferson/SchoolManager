package schoolmanager;

import java.io.PrintStream;
import static java.lang.System.in;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import schoolmanager.view.console.ConsoleMode;
import schoolmanager.view.gui.GuiMode;

public class SchoolManager {

    public static void main(String[] args) {
        
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }        
        
        Scanner scanner = new Scanner(in);
        
        int opcao = 0;
        
        while (opcao != 3){
            System.out.println("Como você deseja iniciar a aplicação?");        
            System.out.println("1. Console");
            System.out.println("2. Interface Gráfica"); 
            System.out.println("3. Sair");       
            System.out.println("Escolha o modo: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    startConsoleMode();
                    break;
                case 2:
                    startGuiMode();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void startConsoleMode() {
        System.out.println("Iniciando no modo console...");
        ConsoleMode consoleMode = new ConsoleMode();
    }
    
    private static void startGuiMode() {
        System.out.println("Iniciando no modo interface gráfica...");
        GuiMode guiMode = new GuiMode();
        guiMode.setLocationRelativeTo(null);
        guiMode.setVisible(true);

    }
    
}
