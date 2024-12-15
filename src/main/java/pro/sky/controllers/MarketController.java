
package pro.sky.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.services.MarketServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class MarketController {

    private final MarketServiceImpl marketService;

    public MarketController(MarketServiceImpl marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/add")
    public void basket (@RequestParam ("id") List<Integer> id) {
        marketService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return marketService.get();
    }
}
