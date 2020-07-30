package yte.test.EMS.web.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EventDto {

    private String name;
    @JsonFormat(pattern="yyyyMMdd")
    private Date startDate;
    @JsonFormat(pattern="yyyyMMdd")
    private Date endDate;
}
