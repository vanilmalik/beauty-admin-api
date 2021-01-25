package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.TimeSlotEntity;
import com.beautysalon.beautyadminapi.repository.TimeSlotEntityRepository;
import com.beautysalon.beautyadminapi.service.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TimeSlotServiceImpl implements TimeSlotService {

    @Autowired
    private TimeSlotEntityRepository timeSlotEntityRepository;

    @Override
    public TimeSlotEntity doRead(Integer id) {
        return timeSlotEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<TimeSlotEntity> doReadAll() {
        return (List<TimeSlotEntity>) timeSlotEntityRepository.findAll();
    }

    @Override
    @Transactional
    public TimeSlotEntity doCreate(TimeSlotEntity timeSlotEntity) {
        return timeSlotEntityRepository.create(timeSlotEntity);
    }

    @Override
    @Transactional
    public TimeSlotEntity doUpdate(TimeSlotEntity timeSlotEntity) {
        return timeSlotEntityRepository.update(timeSlotEntity);
    }

    @Override
    @Transactional
    public void doDelete(TimeSlotEntity botMessageEntity) {
        timeSlotEntityRepository.delete(botMessageEntity);
    }

}
