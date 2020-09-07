package sdev.greenriver.edu.ordersapi.bootstrap;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sdev.greenriver.edu.ordersapi.entities.UserOrder;
import sdev.greenriver.edu.ordersapi.repositories.IOrdersRepository;

import java.time.LocalDate;

@Component
public class OnLoad implements CommandLineRunner
{
    private IOrdersRepository repo;

    public OnLoad(IOrdersRepository repo)
    {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception
    {
        UserOrder[] orders = {
            new UserOrder(0, LocalDate.of(2019, 10, 2), 3, 75.98, true),
            new UserOrder(0, LocalDate.of(2020, 3, 29), 1, 199.99, true),
            new UserOrder(0, LocalDate.of(2020, 7, 7), 12, 212.15, false),
            new UserOrder(0, LocalDate.of(2019, 1, 12), 7, 31.68, true),
            new UserOrder(0, LocalDate.of(2019, 4, 24), 4, 70.00, true),
            new UserOrder(0, LocalDate.of(2020, 8, 1), 9, 129.76, false),
            new UserOrder(0, LocalDate.of(2020, 9, 30), 1, 49.99, false)
        };

        for (UserOrder order : orders)
        {
            repo.save(order);
        }
    }
}
