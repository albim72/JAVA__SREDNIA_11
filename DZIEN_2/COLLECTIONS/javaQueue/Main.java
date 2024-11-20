import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueExamples queueExamples = new QueueExamples();

        //LinkedList jako kolejka FIFO
        Queue<String> linkedlistQueue = queueExamples.createLinkedListQueue();
        queueExamples.printQueue(linkedlistQueue,"LinkedList jako Queue (FIFO)");

        //PriprityQueue - elementy sortowane
        Queue<Integer> priorityQueue = queueExamples.createPriorityQueue();
        queueExamples.printQueue(priorityQueue,"PriorityQueue (kolejnośc naturalna)");

        //ArrayDequeue jako kolejka
        Queue<String> arrayDequeue = queueExamples.createArrayDequeue();
        queueExamples.printQueue(arrayDequeue,"arrayDequeue jako Queue");
    }
}
