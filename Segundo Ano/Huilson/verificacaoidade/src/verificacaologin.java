import java.util.Scanner;

public class verificacaologin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = "Luis";
        String password = "2024";

        String primeira;
        String segunda;

        System.out.println("Digite seu user: ");
        primeira = sc.nextLine();
        System.out.println("Digite sua senha: ");
        segunda = sc.nextLine();

        if (primeira.equals(user) && segunda.equals(password)) {
            System.out.println("Login com sucesso!");
        }else if(primeira != (user) && segunda != (password)){
            System.out.println("Erro no login");
        }
    }
}


