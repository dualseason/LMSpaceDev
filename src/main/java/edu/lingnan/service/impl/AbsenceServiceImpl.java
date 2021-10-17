package edu.lingnan.service.impl;

import edu.lingnan.dto.AbsenceInfo;
import edu.lingnan.entity.Absence;
import edu.lingnan.mapper.AbsenceMapper;
import edu.lingnan.service.AbsenceService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Log4j2
@Service
@Transactional
public class AbsenceServiceImpl implements AbsenceService {
    @Autowired
    private AbsenceMapper absenceMapper;
    @Override
    public List<Absence> queryAllAbsences() {
        List<Absence> absenceList = absenceMapper.queryAllAbsences();
        return absenceList;
    }

    /**
     * 该方法用于处理考勤情况，如果传过来的预约记录中的状态是true，说明该学生并没有缺勤，则删除当天的缺勤记录，
     * 如果传过来的预约记录中的状态是false，说明学生缺勤了，则生成一条缺勤记录
     * @param absenceInfo
     * @return
     */
    @Override
    public int addOneAbsence(AbsenceInfo absenceInfo){
        int i = 1;
        if("true".equals(absenceInfo.getTodayStatus())){
            i = absenceMapper.deleteOneAbsence(absenceInfo.getBId());
            return i;
        }
        i = absenceMapper.addOneAbsence(absenceInfo);
        return i;
    }
}
