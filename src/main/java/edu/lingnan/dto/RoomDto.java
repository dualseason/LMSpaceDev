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
public class RoomDto {
    @JsonProperty("roomName")
    private String roomName;
    @JsonProperty("roomNums")
    private Integer roomNums;
    @JsonProperty("roomIsOpen")
    private String roomIsOpen;
    @JsonProperty("roomBuildingName")
    private String roomBuildingName;
    @JsonProperty("roomCanables")
    private Integer roomCanables;
}
