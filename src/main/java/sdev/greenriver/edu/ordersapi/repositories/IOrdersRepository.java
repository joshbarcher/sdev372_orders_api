package sdev.greenriver.edu.ordersapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdev.greenriver.edu.ordersapi.entities.UserOrder;

@Repository
public interface IOrdersRepository extends JpaRepository<UserOrder, Integer>
{
}
