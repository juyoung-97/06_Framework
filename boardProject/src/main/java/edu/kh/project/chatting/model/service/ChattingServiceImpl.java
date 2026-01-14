package edu.kh.project.chatting.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.chatting.model.dto.ChattingRoom;
import edu.kh.project.chatting.model.mapper.ChattingMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class ChattingServiceImpl implements ChattingService{
	
	@Autowired
	private ChattingMapper mapper;
	
	
	// 채팅방 목록 조회
	@Override
	public List<ChattingRoom> selectRoomList(int memberNo) {
		// TODO Auto-generated method stub
		return mapper.selectRoomList(memberNo);
	}

}
