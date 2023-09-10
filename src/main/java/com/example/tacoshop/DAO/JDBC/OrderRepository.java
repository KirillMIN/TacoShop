package com.example.tacoshop.DAO.JDBC;

import com.example.tacoshop.Entities.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
