package edu.lingnan.service.impl;

import edu.lingnan.mapper.SeatMapper;
import edu.lingnan.service.SeatService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
@Transactional
public class SeatServiceImpl implements SeatService {

    @Autowired(required = false)
    private SeatMapper seatMapper;


}
