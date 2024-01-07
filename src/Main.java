public class Main {
    public static void main(String[] args) {

        divideByZero(4,0);
    }
    public static void divideByZero(int a, int b){
        try { int sum = a / b;
            System.out.println("La divisione tra "+ a + " e " + b + " da: " + sum);
        } catch (ArithmeticException e){
            System.out.println("Non puoi dividere per zero. Questo è l'errore: "+ e);
        } finally{
            System.out.println("Operazione eseguita");
        }
    }
}