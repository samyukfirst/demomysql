package com.example.demomysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    List<Item> getAllItems() {
        //log.info("Reading all contacts");
        return itemService.getAllItems();
    }

    @PostMapping("/items")
    Item saveItem(@RequestBody Item item) {
        //log.info("Saving contact");
        return itemService.saveItem(item);
    }


}
