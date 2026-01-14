package edu.kh.project.chatting.model.service;

import java.util.List;

import edu.kh.project.chatting.model.dto.ChattingRoom;

public interface ChattingService {

	/** 채팅방 목록 조회
	 * @param memberNo
	 * @return
	 */
	List<ChattingRoom> selectRoomList(int memberNo);

}
