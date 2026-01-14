package edu.kh.project.chatting.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

	private int messageNo;
	private String messageContent;
	private String readFl;
	private int senderNo;
	private int chattingRoomNo;
	private String sendTime;
	
}
