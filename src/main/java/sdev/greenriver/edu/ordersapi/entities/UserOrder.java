package sdev.greenriver.edu.ordersapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserOrder
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private LocalDate placed;
    private int items;
    private double total;
    private boolean fulfilled;
}
