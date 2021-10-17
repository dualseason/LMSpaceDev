package edu.lingnan.service.impl;

import edu.lingnan.dto.BookingInfo;
import edu.lingnan.entity.Absence;
import edu.lingnan.mapper.AbsenceMapper;
import edu.lingnan.mapper.BookingMapper;
import edu.lingnan.service.BookingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Log4j2
@Service
@Transactional
public class BookingServiceImp implements BookingService {
    @Autowired
    private BookingMapper bookingMapper;
    @Autowired
    private AbsenceMapper absenceMapper;

    /**
     * 该方法用于查看正在生效的预约记录，并且带有当天的考勤状态
     * 当天的考勤状态有true和false
     * @return
     */
    @Override
    public List<BookingInfo> queryUserfulBookingList() {
        List<BookingInfo> bookingInfos = bookingMapper.queryUserfulBookingList();
        List<Absence> absences = absenceMapper.queryAllAbsences();
        /*
        * 该for循环用于添加正在生效的预约记录的当天考勤状态，通过缺勤记录和预约记录中的相同预约编号，然后在判断缺勤记录的时间和当天时间是否一样
        * 如果缺勤记录的时间和当天时间一样的话，则该考勤状态为false（缺勤）
        * */
        for (int i = 0; i < bookingInfos.size(); i++) {
            for (int j = 0; j < absences.size(); j++) {
                if(absences.get(j).getBId()==bookingInfos.get(i).getBId())
                {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
                    String s = format.format(new Date());
                    if(s.equals(absences.get(j).getATime()))
                    {
                        bookingInfos.get(i).setTodayStatus(false);
                        break;
                    }

                }
                if(j==absences.size()-1){
                    bookingInfos.get(i).setTodayStatus(true);
                }
            }
        }
        return bookingInfos;
    }
}
