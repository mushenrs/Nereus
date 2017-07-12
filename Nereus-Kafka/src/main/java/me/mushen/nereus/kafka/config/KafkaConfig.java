package me.mushen.nereus.kafka.config;

import java.util.Properties;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-10
 */
public class KafkaConfig {

    public static Properties producerProps() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        return props;
    }
}
