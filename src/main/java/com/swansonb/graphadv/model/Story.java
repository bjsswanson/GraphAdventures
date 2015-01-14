package com.swansonb.graphadv.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Story {
	@GraphId Long id;
	String title;
}
