package edu.lingnan.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbsenceInfo {
    @JsonProperty("bId")
    private Integer bId;
    @JsonProperty("aTime")
    private String aTime;
    @JsonProperty("todayStatus")
    private String todayStatus;
}
