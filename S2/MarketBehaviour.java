package com.example.market;

public interface MarketBehaviour {
    void acceptToMarket(Human human);
    void releaseFromMarket(Human human);
    void update();
}