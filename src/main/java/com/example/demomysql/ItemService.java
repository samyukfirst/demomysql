package com.example.demomysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    List<Item> getAllItems() {
        //log.info("Reading all contacts");
        return itemRepository.findAll();
    }

    Item saveItem(Item item) {
        //log.info("Saving contact");
        return itemRepository.save(item);
    }
}
