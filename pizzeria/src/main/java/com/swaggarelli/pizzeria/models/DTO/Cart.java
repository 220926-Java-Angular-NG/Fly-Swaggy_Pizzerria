package com.swaggarelli.pizzeria.models.DTO;


import com.swaggarelli.pizzeria.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {

    private Pizza[] pizzas;
}
