package com.sprint.mission.discodeit.application.dto.user;

import jakarta.validation.constraints.NotBlank;

public record UserCreateRequest(@NotBlank String username, @NotBlank String email,
                                @NotBlank String password) {

}
