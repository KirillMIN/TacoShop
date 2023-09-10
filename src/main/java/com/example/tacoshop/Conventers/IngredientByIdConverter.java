package com.example.tacoshop.Conventers;

import com.example.tacoshop.DAO.JDBC.IngredientRepository;
import com.example.tacoshop.Entities.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//нужен чтобы преобразовывать string данные формы в объекты типа Ingredient
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    IngredientByIdConverter(IngredientRepository ingredientRepo){
        this.ingredientRepo = ingredientRepo;
    }


    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
