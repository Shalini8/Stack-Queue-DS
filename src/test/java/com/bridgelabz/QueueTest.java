package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    public void given3Nums_WhenEnqueued_ShouldBeLast() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Queue queue = new Queue();
        queue.enqueue(firstNode);
        queue.enqueue(secondNode);
        queue.enqueue(thirdNode);
        queue.printQueue();
        Assertions.assertEquals( queue.lastestElementOfQueue(), firstNode);
    }

    @Test
    public void whenDequeued_TailShouldBeMovedBackOneNode() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Queue queue = new Queue();
        queue.enqueue(firstNode);
        queue.enqueue(secondNode);
        queue.enqueue(thirdNode);
        queue.dequeue();
        Assertions.assertEquals(queue.firstElementOfQueue(), secondNode);
    }

}
