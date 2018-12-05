package de.thro.inf.prg3.a09.model.rebellion;

import de.thro.inf.prg3.a09.model.Fighter;
import de.thro.inf.prg3.a09.model.Force;
import javafx.scene.image.Image;

public class YWing extends Fighter {

	public YWing(String pilot, Image fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.LightSide;
	}

	@Override
	public String getFighterType() {
		return "Y-Wing";
	}
}
