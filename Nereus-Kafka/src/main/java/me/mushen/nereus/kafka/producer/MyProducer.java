package me.mushen.nereus.kafka.producer;

import me.mushen.nereus.kafka.config.KafkaConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-10
 */
public class MyProducer {

    public static void main(String[] args){
        Producer<String, String> producer = new KafkaProducer<>(KafkaConfig.producerProps());
        for(int i = 100; i < 200; i++) {
            producer.send(
                    new ProducerRecord<>(
                            "test",
                            Integer.toString(i),
                            Integer.toString(i))
            );
        }
//        producer.close();

        producer.send(
                new ProducerRecord<>("test", "test-key", "test-value")
        );
    }
}
