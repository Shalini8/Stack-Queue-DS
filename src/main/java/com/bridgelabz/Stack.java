package com.bridgelabz;

    public class Stack {
        private final LinkedList linkedList;

        public Stack() {
            this.linkedList = new LinkedList();
        }

        public void push(INode node) {
            linkedList.add(node);
        }

        public void printStack() {
            linkedList.printNodes();
        }

        public INode peak() {
            return linkedList.head;
        }

        public INode pop() {
            return linkedList.pop();
        }

        public void enqueue (INode node){
            linkedList.append(node);
        }

        public INode lastestElementOfStack() {
            return LinkedList.head;
        }
        public void dequeue() {
            linkedList.popLast();
        }
        public INode firstElementOfQueue() {
            return linkedList.tail;
        }

    }

