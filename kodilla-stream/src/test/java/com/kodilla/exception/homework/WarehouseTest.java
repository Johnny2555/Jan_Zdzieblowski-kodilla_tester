package com.kodilla.exception.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testWarehouse (){
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class,()->warehouse.getOrder("4"));
    }


}