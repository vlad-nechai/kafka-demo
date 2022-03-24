package me.leantech.kafka.demo.models.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemTrackingTopic {
    private String topicName;
    private int topicPriority;
}
