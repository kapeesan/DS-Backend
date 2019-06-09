package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Ticket;
import com.example.demo.model.Train;

public interface TrainService {
	
Train save(Train train);
	
Train fetch();
	
Train fetch(Train train);

List<Train> featch();

}
