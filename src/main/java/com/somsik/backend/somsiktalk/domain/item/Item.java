package com.somsik.backend.somsiktalk.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String content;

    public Item() {
    }

    public Item(String content) {
        this.content = content;
    }
}
