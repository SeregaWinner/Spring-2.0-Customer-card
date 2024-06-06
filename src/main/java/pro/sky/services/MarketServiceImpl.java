package pro.sky.services;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.component.Basket;
import pro.sky.model.Item;

import java.util.*;

@Service
@SessionScope
public class MarketServiceImpl {

    ;
    private final Basket basket;


    public MarketServiceImpl( Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> id) {
        basket.add(id);

    }


    public List<Integer> get() {
        return basket.get();
    }
}