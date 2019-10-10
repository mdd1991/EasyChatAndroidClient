package com.king.easychat.netty.packet.resp

import com.king.easychat.netty.MessageType
import com.king.easychat.netty.packet.Packet

/**
 * @author Zed
 * date: 2019/08/19.
 * description:
 */
class AddUserResp(val inviterId: String) : Packet() {
    override fun messageType(): Int {
        return MessageType.ADD_FRIEND_RESP
    }

}