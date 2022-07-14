package top.byteinfo.cd.wsx.ws;


import lombok.Data;
import org.springframework.stereotype.Service;

import javax.websocket.*;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.ServerEndpointConfig;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Data
@Service
@ServerEndpoint(value = "/ws", configurator = WebSocketServiceImpl.ChatConfigurator.class)
public class WebSocketServiceImpl {
    private Session session;

    /**
     * 用户session集合
     */
    private static CopyOnWriteArraySet<WebSocketServiceImpl> webSocketSet = new CopyOnWriteArraySet<>();

    public static class ChatConfigurator extends ServerEndpointConfig.Configurator {

        public static String HEADER_NAME = "X-Real-IP";

        @Override
        public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
            try {
                String firstFoundHeader = request.getHeaders().get(HEADER_NAME.toLowerCase()).get(0);
                sec.getUserProperties().put(HEADER_NAME, firstFoundHeader);
            } catch (Exception e) {
                sec.getUserProperties().put(HEADER_NAME, "未知ip");
            }
        }
    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig endpointConfig) throws IOException {
        // 加入连接
        this.session = session;
        webSocketSet.add(this);



    }

    @OnClose
    public void onClose() throws IOException {
        // 更新在线人数
        webSocketSet.remove(this);

        broadcastMessage("messageDTO");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {


        broadcastMessage("messageDTO");

    }


    private void broadcastMessage(String messageDTO) throws IOException {
        for (WebSocketServiceImpl webSocketService : webSocketSet) {
            synchronized (webSocketService.session) {
                webSocketService.session.getBasicRemote().sendText(messageDTO);
            }
        }
    }
}
