package com.yc.template.Service.DTO;

import com.yc.template.Entity.Area;
import lombok.Data;

@Data
public class FieldDTO {
    private String fieldName;
    private Area area;
    private long orderId;
}
