package Lifeline.wtf.utils;


import Lifeline.wtf.utils.sub.Location;

public class Particles {
	public int ticks;
	public Location location;
	public String text;

	public Particles(final Location location, final String text) {
		this.location = location;
		this.text = text;
		this.ticks = 0;
	}
}