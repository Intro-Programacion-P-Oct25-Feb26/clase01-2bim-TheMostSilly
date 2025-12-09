package paquete04;

public class Ejercicio01 {

    public static void main(String[] args) {
        // Declaro las variables a usar
        
        int columna1 = 0;
        int columna2 = 0;
        int columna3 = 0;
        int columna4 = 0;
        String mensaje = "";
        // Inicio el ciclo for donde i vale 30 y decrece hasta 10
        for (int i = 30; i >= 10; i--) {
        
            int num = i;
            int numero2 = i * 2;
            int numero3 = i * 3;
            int numero4 = i * 4;
        
            columna1 = columna1 + num;
            columna2 = columna2 + numero2;
            columna3 = columna3 + numero3;
            columna4 = columna4 + numero4;
        // Concateno las variables dentro de la variable resultado
        // Usando String.format
            mensaje = String.format("%s%d-%d-%d-%d\n",
                    mensaje,
                    num,
                    numero2,
                    numero3,
                    numero4);
            
        }
        /*
        Se imprime todo con printf
        */
        System.out.printf("%s\nTotales = %d-%d-%d-%d\n",
                mensaje,
                columna1,
                columna2,
                columna3,
                columna4);
    }
}
    


