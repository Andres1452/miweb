import java.util.Scanner;

public class adivinarNumero {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
    
        int numero;
        do{
            System.out.println ("Ingrese el numero 5 :");
            numero=teclado.nextInt();
        
        }while  ( numero !=5 );
            System.out.println ("correcto has ingresado el numero: 5");
        

}
}