package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.TimeSlotEntity;

import java.util.List;

public interface TimeSlotService {

    TimeSlotEntity doRead(Integer id);

    List<TimeSlotEntity> doReadAll();

    TimeSlotEntity doCreate(TimeSlotEntity timeSlotEntity);

    TimeSlotEntity doUpdate(TimeSlotEntity timeSlotEntity);

    void doDelete(TimeSlotEntity timeSlotEntity);
}
