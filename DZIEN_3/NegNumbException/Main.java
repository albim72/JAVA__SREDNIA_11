public class Main {
    public static void validateInput(int value,String errorDetails) throws CustomException{
        if (value < 0) {
            throw new CustomException("Wartośc nie może byc ujemna!",1001,errorDetails);
        }else {
            System.out.println("Wartośc poprawna: " + value);
        }
    }
    public static void main(String[] args) {

        try {
            validateInput(-10,"wartośc z zakresu liczb całkowitych ujemnych");
        } catch (CustomException e) {
            System.out.println("Wyjątek: " + e);
        }

        try {
            validateInput(22,"wartośc z zakresu liczb całkowitych ujemnych");
        } catch (CustomException e) {
            System.out.println("Wyjątek: " + e);
        }

        try {
            validateInput(-2,null);
        } catch (CustomException e) {
            System.out.println("Wyjątek: " + e);
        }
    }
}
