import java.util.Scanner;

public class MiniChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MiniChatbot: Olá! Digite 'sair' para encerrar a conversa.");

        while (true) {
            //Caso algum burro digitar com o CAPSLOCK ativo
            String mensagem = scanner.nextLine().toLowerCase();

            if (mensagem.contains("sair")) {
                System.out.println("MiniChatbot: Até logo! Foi bom conversar com você.");
                break;
            } else if (mensagem.contains("olá") || mensagem.contains("oi")) {
                System.out.println("MiniChatbot: Olá! Como posso ajudar você?");
            } else if (mensagem.contains("qual é o seu nome")) {
                System.out.println("MiniChatbot: Meu nome é MiniChatbot.");
            } else if (mensagem.contains("como você está")) {
                System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
            } else {
                System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta.");
            }
        }

        scanner.close();
    }
}