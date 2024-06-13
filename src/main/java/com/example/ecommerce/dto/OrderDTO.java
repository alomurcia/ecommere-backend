package com.example.ecommerce.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private String customerName;
    private LocalDateTime orderDate;
    private List<OrderItemDTO> orderItems;
}