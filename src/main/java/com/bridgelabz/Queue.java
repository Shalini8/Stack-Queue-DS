package com.bridgelabz;

public class Queue {
    private final LinkedList linkedList;

    public Queue(LinkedList linkedList) {
        this.linkedList = linkedList;
    }
    public void enqueue
            (INode node){
        linkedList.append(node);
    }
    public void dequeue() {
        linkedList.popLast();
    }
    public void printQueue() {
        linkedList.printNodes();
    }
    public INode lastestElementOfQueue() {
        return LinkedList.head;
    }

    public INode firstElementOfQueue() {
        return linkedList.tail;
    }
}
