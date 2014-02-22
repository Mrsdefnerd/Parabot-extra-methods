package org.parabot.mrsdefnerd.extras;

public class ExtraMethods {
	
	private static final String RUN_ENERGY_FIELD = "al";
	private static final int NOTE_SETTING = 115;
	private static final int RUN_SETTING = 173;
	
	public static boolean isNotingEnabled() {
		return Settings.getSetting(NOTE_SETTING) == 1;
	}
	
	public static boolean isRunEnabled() {
		return Settings.getSetting(RUN_SETTING) == 0;
	}
	
	public static int getRunEnergy() {
		return (int) Reflection.getFieldValue(RUN_ENERGY_FIELD);
	}

}
