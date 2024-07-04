package com.orderService.Order;

import com.orderService.Order.Services.OrderService;
import com.orderService.Order.Services.ShippingService;
import com.orderService.Order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@ComponentScan({"com.orderService.Order"})
@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(OrderApplication.class, args);}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150, 20);
		System.out.println("Pedido codigo: "+order.getCode());
		System.out.printf("valor total R$ %.2f%n", orderService.total(order));
	}
}
