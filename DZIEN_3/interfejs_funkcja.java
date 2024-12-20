public class Main {
    interface ft1 {
        int operation(int a, int b);
    }

    interface  ft2 {
        void sayMessage(String message);
    }

    private int operate(int a, int b, ft1 fobj){
        return fobj.operation(a,b);
    }
    public static void main(String[] args) {
        ft1 add = (int x,int y) -> x+y;
        ft1 multiply = (int x,int y) -> x*y;

        Main mobj = new Main();
        System.out.println("dodawanie: " + mobj.operate(6,8,add));
        System.out.println("mnożenie: " + mobj.operate(6,8,multiply));

        ft2 msg = message -> System.out.println("wynik: " + message);
        msg.sayMessage("ABC - 62545635465");
    }
}
