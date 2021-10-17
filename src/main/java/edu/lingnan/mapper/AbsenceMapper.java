package edu.lingnan.mapper;

import edu.lingnan.dto.AbsenceInfo;
import edu.lingnan.entity.Absence;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AbsenceMapper {
    /**
     * 查询所有的缺勤记录
     * @return
     */
    List<Absence> queryAllAbsences();

    /**
     * 增加一条缺勤记录
     * @return
     */
    int addOneAbsence(AbsenceInfo absenceInfo);

    /**
     * 删除一条缺勤记录
     * @param aId 缺勤编号
     * @return
     */
    int deleteOneAbsence(Integer aId);
}
