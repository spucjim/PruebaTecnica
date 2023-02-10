class Ejercicio_2{


    
    public static void main(String[] args) {
        
        try {

            Persona [] PERSONAS = new Persona [50];

            //Iba a poner también una entrada de teclado pero, meter 50 personas me parece demasiado tedioso para que comprobéis si funciona o no, 
            //en el código comentado de abajo os he dejado un ejemplo simplificado.

            //      Persona [] PERSONAS = new Persona [4]; //Creamos el array que recogerá a todas las personas 
            //      PERSONAS[0] = new Persona(10,'m');
            //      PERSONAS[1] = new Persona(20,'f');
            //      PERSONAS[2] = new Persona(45,'f');
            //      PERSONAS[3] = new Persona(10,'f');
            
                    //Iniciamos contadores para la posterior salida de datos
            
                    int mayorEdad=0; 
                    int menorEdad=0;
                    int mayorMasc=0;
                    int menorFem=0;
                    int mujeres=0;
            
                    for(int i=0;i<PERSONAS.length;i++){ //Recorremos el array con los datos y los tratamos, se podría haber hecho también con un switch case.
            
                        
                       if(PERSONAS[i].edad>=18){
                        mayorEdad++;
                        
                       }else{
                        menorEdad++;
                
                       }
            
                       if(PERSONAS[i].sexo=='f'){
                        mujeres++;
                       }
            
                       if(PERSONAS[i].edad>18 && PERSONAS[i].sexo == 'm'){
                        mayorMasc++;
                       }else if(PERSONAS[i].edad<18 && PERSONAS[i].sexo == 'f'){
                        menorFem++;
                       }
            
                    }
            
                    double totalMayoresEdad;
                    double totalMujeres;
            
                    totalMayoresEdad = ((double)mayorEdad/PERSONAS.length)*100;
                    totalMujeres = ((double)mujeres/PERSONAS.length)*100;
            
                
                    System.out.println("Hay "+mayorEdad+" personas mayores de edad");
                    System.out.println("Hay "+menorEdad+" personas menores de edad");
                    System.out.println("Hay "+mayorMasc+" personas masculinas mayores de edad");
                    System.out.println("Hay "+menorFem+" personas femeninas menores de edad");
                    System.out.println("En total, un "+totalMayoresEdad+"% de personas son mayores de edad");
                    System.out.println("En total, un "+totalMujeres+"% de personas son mujeres");

        } catch (Exception e) {
            System.err.println(e);
        }

       

    }


}