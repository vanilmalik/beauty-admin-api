package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.CalendarEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarEntityRepository extends CrudRepository<CalendarEntity, Integer>, CrudRepositoryCustom<CalendarEntity> {
}
