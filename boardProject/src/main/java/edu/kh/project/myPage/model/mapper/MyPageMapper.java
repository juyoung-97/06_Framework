package edu.kh.project.myPage.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.dto.UploadFile;

@Mapper
public interface MyPageMapper {

	/** 회원 정보 수정 SQL
	 * @param inputMember
	 * @return
	 */
	int updateInfo(Member inputMember);







	/** 비밀번호 수정 SQL
	 * @param paramMap
	 * @return
	 */
	int changePw(Map<String, Object> paramMap);







	/** 현재 비밀번호 같은지 조회 SQL
	 * @param memberNo
	 * @return
	 */
	String selectPw(int memberNo);







	/** 회원 탈퇴 SQL (update)
	 * @param memberNo
	 * @return
	 */
	int secession(int memberNo);







	/** 파일 정보를 DB에 삽입 SQL (INSERT)
	 * @param uf
	 * @return
	 */
	int insertUploadFile(UploadFile uf);







	/** 파일 목록 조회 SQL (SELECT)
	 * @param memberNo
	 * @return
	 */
	List<UploadFile> fileList(int memberNo);







	/** 프로필 이미지 변경 SQL (UPDATE)
	 * @param member
	 * @return
	 */
	int profile(Member member);


	
	

}
