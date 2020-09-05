package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.CalendarEntity;
import com.beautysalon.beautyadminapi.repository.CalendarEntityRepository;
import com.beautysalon.beautyadminapi.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    private CalendarEntityRepository calendarEntityRepository;

    @Override
    public CalendarEntity doRead(Integer id) {
        return calendarEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<CalendarEntity> doReadAll() {
        return (List<CalendarEntity>) calendarEntityRepository.findAll();
    }

    @Override
    @Transactional
    public CalendarEntity doCreate(CalendarEntity calendarEntity) {
        return calendarEntityRepository.create(calendarEntity);
    }

    @Override
    @Transactional
    public CalendarEntity doUpdate(CalendarEntity calendarEntity) {
        return calendarEntityRepository.update(calendarEntity);
    }

    @Override
    @Transactional
    public void doDelete(CalendarEntity botMessageEntity) {
        calendarEntityRepository.delete(botMessageEntity);
    }

}
