package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.CalendarEntity;

import java.util.List;

public interface CalendarService {

    CalendarEntity doRead(Integer id);

    List<CalendarEntity> doReadAll();

    CalendarEntity doCreate(CalendarEntity calendarEntity);

    CalendarEntity doUpdate(CalendarEntity calendarEntity);

    void doDelete(CalendarEntity calendarEntity);
}
