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
    }

