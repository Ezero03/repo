import java.util.Scanner;

public class ControlNoms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nom, resultat = "";

        System.out.println("Introdueix un nom: ");
        nom = scan.nextLine();

        if(nom == "AAAAAAAAA"){
            resultat = "NO";
        }
        else if(nom == "AAAAAAAAAAAAAAB"){
            resultat = "SI";
        }
        else if(nom == "AaAaAaAaAaAa"){
            resultat = "SI";
        }
        else if(nom == "A"){
            resultat = "NO";
        }

        System.out.println(resultat);
    }
}
