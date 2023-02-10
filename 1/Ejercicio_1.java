import java.util.Scanner;

class Ejercicio_1{

    

    public static void main(String[] args) {


        try {

            //Pedimos un número por terminal para poder iniciar la ejecución
        Scanner sc = new Scanner(System.in);                    
        System.out.println("Por favor, ponga un número");
        int LEER_NUMERO = sc.nextInt();
        int NUMERO = LEER_NUMERO;
        sc.close();
        System.out.println("");//linea en blanco para que quede más aseado en la terminal

        //Usamos el operador módulo(2) para comprobar si es par o impar el número y, en base a eso operamos con dos bucles for
        if(NUMERO%2==0){
            for(int i=NUMERO;i>=0;i-=2){
                System.out.println(i);
            }
        }else{
            for(int i=NUMERO;i>=1;i-=2){
                System.out.println(i);
            }
        }
        
        //En los println parece que salga el número seleccionado repetido, esto se debe a que guarda en la terminal el número seleccionado y, posteriormente hace
        //la cuenta regresiva, empezando por dicho número
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

}