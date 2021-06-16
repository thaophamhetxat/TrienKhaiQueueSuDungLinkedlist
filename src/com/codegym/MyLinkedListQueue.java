package com.codegym;


class Note {
    public Note next;
    public int key;

    public Note(int key) {
        this.key = key;
        this.next = null;
    }
}

public class MyLinkedListQueue {
    private Note tail;
    private Note head;
    public int numbers=1;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Note temp = new Note(key);
        if(this.tail==null){
            this.head=this.tail=temp;
            return;
        }
        this.tail.next = temp;
        this.tail=temp;
        numbers++;
    }
    public Note dequeue(){
        if(this.head==null)
            return null;
        Note temp = this.head;
        this.head = this.head.next;
        if(this.head==null){
            this.tail=null;
        }return temp;

    }
    //dem so luong cac phan tu trong list
    public int size(){
        return numbers;
    }


}
