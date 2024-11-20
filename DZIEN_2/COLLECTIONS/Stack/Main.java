//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MyStack<Integer> stack = new MyStack<>();
        stack.push(11);
        stack.push(23);
        stack.push(28);
        stack.push(33);

        System.out.println("rozmiar stosu: " + stack.size());
        System.out.println("element na szczycie: " + stack.peek());
        System.out.println("usunięty element: " + stack.pop());
        System.out.println("rozmiar stosu: " + stack.size());
        System.out.println("czy jest pusty? " + stack.isEmpty());
    }
}
