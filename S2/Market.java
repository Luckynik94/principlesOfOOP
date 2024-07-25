package com.example.market;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    private Queue<Human> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " accepted to the market.");
        takeInQueue(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        System.out.println(human.getName() + " released from the market.");
        releaseFromQueue(human);
    }

    @Override
    public void takeInQueue(Human human) {
        queue.add(human);
        System.out.println(human.getName() + " added to the queue.");
    }

    @Override
    public void releaseFromQueue(Human human) {
        queue.remove(human);
        System.out.println(human.getName() + " removed from the queue.");
    }

    @Override
    public void takeOrder() {
        Human human = queue.peek();
        if (human != null) {
            System.out.println(human.getName() + " takes an order.");
        } else {
            System.out.println("Queue is empty, no one to take orders.");
        }
    }

    @Override
    public void giveOrder() {
        Human human = queue.peek();
        if (human != null) {
            System.out.println(human.getName() + " gets an order.");
        } else {
            System.out.println("Queue is empty, no one to give orders.");
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
    }
}