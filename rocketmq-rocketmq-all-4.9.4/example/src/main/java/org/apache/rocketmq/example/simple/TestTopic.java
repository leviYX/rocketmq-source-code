package org.apache.rocketmq.example.simple;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.tools.admin.DefaultMQAdminExt;

/**
 * @Description:
 * @Author: Levi
 * @Date: 2024/6/24 12:01
 */

public class TestTopic {
    public static void main(String[] args) throws MQClientException {
        // NameServer 地址
        String nameServerAddr = "127.0.0.1:9876";
        // 要创建的 Topic 名称
        String topicName = "YXYtopic";
        // 目标 Broker 名称
        String brokerName = "broker-a"; // 请根据实际 Broker 名称填写
        // 默认 queue 数量
        int queueNum = 4;

        // 初始化管理工具
        DefaultMQAdminExt mqAdmin = new DefaultMQAdminExt();
        mqAdmin.setNamesrvAddr(nameServerAddr);
        mqAdmin.start();

        try {
            // 创建 Topic
            mqAdmin.createTopic(brokerName, topicName, queueNum);
            System.out.println("Topic " + topicName + " created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭管理工具
            mqAdmin.shutdown();
        }
    }

}