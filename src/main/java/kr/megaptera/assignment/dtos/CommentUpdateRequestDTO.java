package kr.megaptera.assignment.dtos;

import lombok.Builder;

@Builder
public record CommentUpdateRequestDTO(
        String content
) {
}
