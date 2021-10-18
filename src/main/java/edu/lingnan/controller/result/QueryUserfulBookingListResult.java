package edu.lingnan.controller.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.lingnan.dto.BookingInfo;
import edu.lingnan.vo.Result;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryUserfulBookingListResult extends Result {
    @ApiModelProperty(value = "bookingInfos")
    @JsonProperty("bookingInfos")
    private List<BookingInfo> bookingInfos;
}
