package projcet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projcet.dto.BoardPostDto;
import projcet.entity.Board;
import projcet.repository.BoardRepository;

@Service
@RequiredArgsConstructor //싱글톤 관리

public class BoardService {
    private final BoardRepository boardRepository;

    public Long createBoard(BoardPostDto boardPostDto) {
        Board board = new Board();
        board.setTitle(boardPostDto.getTitle());
        board.setContent(boardPostDto.getContent());

        return boardRepository.save(board).getBoardId();
    }
}
