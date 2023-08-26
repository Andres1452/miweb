public class DatosEnteros {
    public static void main(String[] args) {
        int edad1;
        int segundos;
        int dias,diferencia, suma, division, edad2, dias2, segundos2;
        edad1= 18;
        edad2=24;
        
        dias= edad1*365;
        segundos= dias*86400;
        System.out.println("de la edad1 han pasado: ");
        System.out.println(segundos);

        dias2=edad2*365;
        segundos2=dias2*86400;
        System.out.println("de la edad2 han pasado: ");
        System.out.println(segundos2);

        diferencia = segundos2 - segundos;
        System.out.print("la diferencia entre las edades es : "+ diferencia);

    }
    
}
