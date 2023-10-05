package model;

import java.time.LocalDate;

public record Pedido(String producto, LocalDate fechaPedido, double precio) {

}
