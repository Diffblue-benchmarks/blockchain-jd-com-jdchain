/**
 * Copyright: Copyright 2016-2020 JD.COM All Right Reserved
 * FileName: com.jd.blockchain.stp.commucation.MyMessageExecutor
 * Author: shaozhuguang
 * Department: Y事业部
 * Date: 2019/4/17 下午3:38
 * Description:
 */
package com.jd.blockchain.stp.commucation;

import com.jd.blockchain.stp.communication.MessageExecute;
import com.jd.blockchain.stp.communication.RemoteSession;

import java.nio.charset.Charset;

/**
 *
 * @author shaozhuguang
 * @create 2019/4/17
 * @since 1.0.0
 */

public class MyMessageExecutor implements MessageExecute {

    @Override
    public byte[] receive(String key, byte[] data, RemoteSession session) {
        String receiveMsg = new String(data, Charset.defaultCharset());
        System.out.printf("receive client {%s} request {%s} \r\n", session.sessionId(), receiveMsg);
        String msg = session.sessionId() + " -> received !!!";
        return msg.getBytes(Charset.defaultCharset());
    }

    @Override
    public REPLY replyType() {
        return REPLY.AUTO;
    }
}