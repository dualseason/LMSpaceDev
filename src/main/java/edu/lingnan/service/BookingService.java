package edu.lingnan.service;

import edu.lingnan.dto.BookingInfo;

import java.util.List;

public interface BookingService {
    List<BookingInfo> queryUserfulBookingList();
}
