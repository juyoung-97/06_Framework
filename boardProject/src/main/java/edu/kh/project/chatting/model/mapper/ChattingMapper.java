package edu.kh.project.chatting.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.chatting.model.dto.ChattingRoom;

@Mapper
public interface ChattingMapper {

	/** 채팅방 목록 조회 SQL
	 * @param memberNo
	 * @return
	 */
	List<ChattingRoom> selectRoomList(int memberNo);

}
