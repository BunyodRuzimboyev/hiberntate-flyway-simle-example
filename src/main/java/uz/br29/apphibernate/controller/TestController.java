package uz.br29.apphibernate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.br29.apphibernate.entity.Product;
import uz.br29.apphibernate.service.ProductService;

@RestController
@RequestMapping("/test")
public class TestController {

    private final ProductService service;

    public TestController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public ResponseEntity get() {
        ResponseEntity responseEntity = service.saveProduct(new Product("Orange", "description", 1l, 12.00));
        return responseEntity;
    }

}
