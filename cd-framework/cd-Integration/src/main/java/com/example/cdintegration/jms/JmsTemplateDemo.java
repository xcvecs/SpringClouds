//package com.example.cdintegration.jms;
//
//public class JmsTemplateDemo {
//
//    public class JmsQueueSender {
//
//        private JmsTemplate jmsTemplate;
//        private Queue queue;
//
//        public void setConnectionFactory(ConnectionFactory cf) {
//            this.jmsTemplate = new JmsTemplate(cf);
//        }
//
//        public void setQueue(Queue queue) {
//            this.queue = queue;
//        }
//
//        public void simpleSend() {
//            this.jmsTemplate.send(this.queue, new MessageCreator() {
//                public Message createMessage(Session session) throws JMSException {
//                    return session.createTextMessage("hello queue world");
//                }
//            });
//        }
//    }
//}
