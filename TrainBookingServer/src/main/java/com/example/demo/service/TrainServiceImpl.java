package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;
import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService{
	
	@Autowired
	TrainRepository trainRepository;

	@Override
	public Train save(Train train) {
		// TODO Auto-generated method stub
		return trainRepository.save(train);
	}

	@Override
	public Train fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train fetch(Train train) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Train> featch() {
		// TODO Auto-generated method stub
		return trainRepository.findAll();
	}

}
