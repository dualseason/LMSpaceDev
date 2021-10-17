package edu.lingnan.service;

import edu.lingnan.dto.AbsenceInfo;
import edu.lingnan.entity.Absence;

import java.util.List;

public interface AbsenceService {

    List<Absence> queryAllAbsences();
    int addOneAbsence(AbsenceInfo absenceInfo);
}
