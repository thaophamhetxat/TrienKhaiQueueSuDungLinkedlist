package com.codegym;

public class MyLinkedListQueueTest {

    public static void main(String[] args) {
	MyLinkedListQueue queue = new MyLinkedListQueue();
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(9);
	queue.enqueue(30);
	queue.enqueue(40);
        System.out.println("Dequeued item is "+queue.dequeue().key);
		System.out.println("size = "+queue.size());
    }
}
