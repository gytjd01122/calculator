package com.myname.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
        String sum (@RequestParam("a") Integer a , @RequestParam("b") Integer b) {
                        return String.valueOf(calculator.sum(a, b));
        };
    @RequestMapping("/minus")
        String minus (@RequestParam("a") Integer a , @RequestParam("b") Integer b) {
                        return String.valueOf(calculator.minus(a, b));
        };
    @RequestMapping("/cross")
        String cross (@RequestParam("a") Integer a , @RequestParam("b") Integer b) {
                        return String.valueOf(calculator.cross(a, b));
        };
    @RequestMapping("divide")
        String divide (@RequestParam("a") Integer a , @RequestParam("b") Integer b){
            return String.valueOf(calculator.divide(a, b));
        };
}


