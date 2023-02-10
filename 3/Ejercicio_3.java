import java.util.Scanner;
class Ejercicio_3 {
    public static void main(String[] args) {
        
        try {

        //PEDIMOS LA TARIFA    
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la tarifa (separador decimal Español, la coma)");
        double LEER_TARIFA = sc.nextDouble();

        //PEDIMOS LAS HROAS SEMANALES
        System.out.println("Indique las horas trabajadas semanalmente");
        int LEER_HORASTRABAJADAS = sc.nextInt();
        sc.close();

        //INICIALIZAMOS LAS VARIABLES A UTILIZAR
        double TARIFA=LEER_TARIFA;
        int HORASTRABAJADAS=LEER_HORASTRABAJADAS;
        double sueldo;
        int diferenciaHoras = HORASTRABAJADAS - 40; //estas serán las horas extra con una cotización diferente


        if(HORASTRABAJADAS>40){ //Para el cálculo de las horas extra

            sueldo=TARIFA*40;
            sueldo = sueldo + diferenciaHoras*TARIFA*1.5;

        }else{
            sueldo=TARIFA*(double)HORASTRABAJADAS;  
        }

        //El sueldo semanal, mensual y anual.
        System.out.println("Su sueldo semanal será de "+sueldo+" euros");
        System.out.println("Su sueldo mensual será de "+sueldo*4+" euros");
        System.out.println("Su sueldo anual será de "+sueldo*4*12+" euros");


        } catch (Exception e) {
           System.err.println(e);
        }
        
    }
}