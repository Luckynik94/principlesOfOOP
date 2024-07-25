package com.example.market;

public interface QueueBehaviour {
    void takeInQueue(Human human);
    void releaseFromQueue(Human human);
    void takeOrder();
    void giveOrder();
}