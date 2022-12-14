package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import com.mjc.stage2.ShopStock;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManufactureFilteringStrategy implements FilteringStrategy {
    private String manufacture;

    @Override
    public boolean filter(Product product) {
        return product.getManufacture().equalsIgnoreCase(manufacture);
    }
}
