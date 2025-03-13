package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.User;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(UUID id);

    List<User> findByName(String name);

    Optional<User> findByEmail(String email);

    List<User> findAll();

    void updateName(UUID id, String name);

    void delete(UUID id);
}
