package com.blackdroidstudios.cleansweep.reportlog;

/**
 * @author Xin Qu
 */

//Formatted output debugging and analysis 
//import com.blackdroidstudios.cleansweep.gui.Actor;
import com.blackdroidstudios.cleansweep.map.Tile;
import com.blackdroidstudios.cleansweep.map.Tile.floorType;
import com.blackdroidstudios.cleansweep.map.Tile.tileType;
import com.blackdroidstudios.cleansweep.surfacesensor.SurfaceSensor;

public class Reporter {
	
	private static Reporter instance = null;
	
	Reporter() {}
	
	private int batteryCharge;
	private int currentLocX;
	private int currentLocY;
	private int currentDirtLvl;
	private String customReport;  //added variable to hold custom messages
	private boolean isCharging;
	private boolean isCleaning;
	private floorType currentFlrType;
	
	public static Reporter getInstance(){
		if (instance == null){
			instance = new Reporter();
		}
		return instance;
	}
	
	public void setCurrentBattery(int charge)
	{
		this.batteryCharge = charge;
	}
	
	public void setCurrentLocX(int locX)
	{
		this.currentLocX = locX;
	}
	
	public void setCurrentLocY(int locY)
	{
		this.currentLocY = locY;
	}
	
	public void setCurrentDirtLvl(int dirtLvl)
	{
		this.currentDirtLvl = dirtLvl;
	}
	
	public void setCurrentFlrType(floorType flrType)
	{
		this.currentFlrType = flrType;
	}
	
	public int getCurrentBattery()
	{
		return batteryCharge;
	}
	
	public int getCurrentLocX()
	{
		return currentLocX;
	}
	
	public int getCurrentLocY()
	{
		return currentLocY;
	}
	
	public int getCurrentDirtLvl()
	{
		return currentDirtLvl;
	}
	
	public static String report()
	{
		return ("Clean Sweep is currently at " + 
				Reporter.getInstance().currentLocX + "," + Reporter.getInstance().currentLocY +
				"\n with a battery level of: " + Reporter.getInstance().batteryCharge);
	}
	
	public String printGUI(String input) {  //added method to print custom messages to GUI report log
		customReport = input;
		return (Reporter.getInstance().customReport);
	}
}