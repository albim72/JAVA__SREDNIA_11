public class Main {
    public static void main(String[] args) {
        try{
            throw new MExcept("To jest mój wyjątek!");
        } catch (MExcept e) {
            System.out.println(e.getMessage());
        }
    }
}
