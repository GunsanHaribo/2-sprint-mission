package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.BinaryContent;
import java.util.Optional;
import java.util.UUID;

public interface BinaryContentRepository {

  BinaryContent save(BinaryContent binaryContent);

  Optional<BinaryContent> findByBinaryContentId(UUID uuid);

  void delete(UUID id);
}
