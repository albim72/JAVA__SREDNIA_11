import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    //LinkedList jako Queue
    public Queue<String> createLinkedListQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Anna");
        queue.add("Marek");
        queue.add("Roma");
        queue.add("Nadia");
        queue.add("Leon");
        return queue;
    }

    //PriorityQueue

    public Queue<Integer> createPriorityQueue(){
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(43);
        priorityQueue.add(75);
        priorityQueue.add(65);
        priorityQueue.add(32);
        priorityQueue.add(98);
        return priorityQueue;
    }
    
    //ArrayDeque
    public Queue<String> createArrayDequeue(){
        Queue<String> dequeueQueue = new ArrayDeque<>();
        dequeueQueue.add("Kraków");
        dequeueQueue.add("Katowice");
        dequeueQueue.add("Rzeszów");
        dequeueQueue.add("Toruń");
        return dequeueQueue;
    }
    
    //metoda pomocnicza do wyświetlania zawartości kolejki
    public <T> void printQueue(Queue<T> queue,String queueType){
        System.out.println("\n"+queueType+":");
        while (!queue.isEmpty()) {
            System.out.println("Usunięto: " +  queue.poll());
        }
    }
}
