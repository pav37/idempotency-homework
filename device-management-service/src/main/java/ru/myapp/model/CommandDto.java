package ru.myapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Data
@RedisHash("command")
public class CommandDto {
    private String deviceId;
    private String sensorId;
    private String actionType;
    private String value;
    private String oldValue;
    @Id
    private UUID messageId;
    private String userId;
    private String username;
    private String email;
    @TimeToLive(unit = TimeUnit.MINUTES) Long timeout = 5L;

}
