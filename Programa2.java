public class Programa2 {
    public static void main(String[] args) {
        String palabras[]=new String[25];

        System.out.println("Programa 2.");
        try {
            System.out.println("La primera palabra es " + palabras[-1]);
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println(error.getMessage());
        }
        try {
            System.out.println("La primera letra de la primera palabra es " + palabras[0].charAt(0));
        } catch(NullPointerException error){
            System.out.print(error.getMessage());
        }
    }
}
