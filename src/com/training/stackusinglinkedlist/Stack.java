package com.training.stackusinglinkedlist;

import com.training.linkedlist.LinkedList;

public class Stack<T> {
    private LinkedList<T> Top = new LinkedList<>();

    public void push(T value){
        Top.addNodeFront(value);
    }

    public void display(){
        Top.printList();
    }

    public void pop(){
        Top.deleteNodeFront();
    }

    public T top(){
        return (T) Top.getHead().getValue();
    }

    public boolean isEmpty(){
        if(Top.getHead()==null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(70);
        s.push(30);
        s.push(56);
        s.display();
        s.pop();
        s.pop();
        s.display();
        s.pop();
        System.out.println(s.isEmpty());

    }
}
