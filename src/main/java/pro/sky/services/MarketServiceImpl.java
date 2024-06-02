package pro.sky.services;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.component.Basket;
import pro.sky.model.Item;

import java.util.*;

@Service
@SessionScope
public class MarketServiceImpl {

    private final List<Integer> itemMarket;
    private final Basket basket;


    public MarketServiceImpl(List<Integer> itemMarket, Basket basket) {
        this.itemMarket = itemMarket;
        this.basket = basket;
    }

    public void add(List<Integer> ids) {
        basket.add(ids);

    }


    public List<Integer> get() {
        return basket.get();
    }
}