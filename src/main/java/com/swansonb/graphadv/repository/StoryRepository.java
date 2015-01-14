package com.swansonb.graphadv.repository;

import com.swansonb.graphadv.model.Story;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface StoryRepository extends GraphRepository<Story> {}