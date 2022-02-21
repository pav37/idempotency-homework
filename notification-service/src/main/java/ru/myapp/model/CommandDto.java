package ru.myapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CommandDto {
    private String deviceId;
    private String sensorId;
    private String actionType;
    private String value;
    private String userId;
    private String username;
    private String email;
    private String oldValue;
    private String messageId;
}
