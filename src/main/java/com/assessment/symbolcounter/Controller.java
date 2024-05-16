package com.assessment.symbolcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    SymbolCounterService symbolCounterService;
    @GetMapping("/number-of-times/{n}")
    public String countSymbols(@PathVariable int n) {
        int[] result = symbolCounterService.countSymbols(n);
        return result[0] +" "+ result[1];
    }
}
