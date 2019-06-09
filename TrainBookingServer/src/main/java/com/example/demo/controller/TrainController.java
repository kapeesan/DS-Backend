package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.model.Ticket;
import com.example.demo.model.Train;
import com.example.demo.service.PaymentService;
import com.example.demo.service.TicketService;
import com.example.demo.service.TrainService;

@RestController
@RequestMapping(value="/booking")
public class TrainController {
	
	@Autowired
	TrainService trainService;
	@Autowired
	TicketService ticketService;
	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value = "/train", method = RequestMethod.POST)
	public Train save(@RequestBody Train train) {
		
		return trainService.save(train);
	}
	
	@RequestMapping(value = "/alltrain",method = RequestMethod.GET)
	public List<Train>featch(){
		return trainService.featch();
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.POST)
	public Ticket save(@RequestBody Ticket ticket) {
		
		return ticketService.save(ticket);
	}
	
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public Payment save(@RequestBody Payment payment) {
		
		return paymentService.save(payment);
	}
}
