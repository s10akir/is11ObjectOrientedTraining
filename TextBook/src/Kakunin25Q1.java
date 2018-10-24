import java.util.LinkedList;

/**
 * @author Akira Shinohara
 * @since 2018.07.10
 */
public class Kakunin25Q1 {
    public static void main(String[] args) {
        QueueList queue = new QueueList();

        for (int i = 0; i < 3; i++) {
            queue.enqueue(i);
        }

        for(int i = 0; i < 3; i++) {
            queue.dequeuer();
        }
    }
}


class QueueList {
    private LinkedList<Integer> list;


    QueueList() {
        list = new LinkedList<>();
    }


    int enqueue(Integer youso) {
        System.out.println("enqueue: " + youso);
        list.addLast(youso);

        return list.size();
    }


    Object dequeuer() {
        Integer element = list.getFirst();

        System.out.println("dequeue: " + element);
        list.removeFirst();

        return element;
    }
 }