package com.rami.chanteurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomChant", types = { Chanteur.class })

public interface ChanteurProjection {
	public String getNomChanteur();
}
