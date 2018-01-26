package com.kuka.generated.ioAccess;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.ioModel.AbstractIOGroup;
import com.kuka.roboticsAPI.ioModel.IOTypes;

/**
 * Automatically generated class to abstract I/O access to I/O group <b>ExternalIO</b>.<br>
 * <i>Please, do not modify!</i>
 * <p>
 * <b>I/O group description:</b><br>
 * EK1100 with 
EL1809
EL2809
 */
@Singleton
public class ExternalIOIOGroup extends AbstractIOGroup
{
	/**
	 * Constructor to create an instance of class 'ExternalIO'.<br>
	 * <i>This constructor is automatically generated. Please, do not modify!</i>
	 *
	 * @param controller
	 *            the controller, which has access to the I/O group 'ExternalIO'
	 */
	@Inject
	public ExternalIOIOGroup(Controller controller)
	{
		super(controller, "ExternalIO");

		addInput("AE_i02Start", IOTypes.BOOLEAN, 1);
		addInput("AE_i01Enable", IOTypes.BOOLEAN, 1);
		addInput("IN03_Start_Button", IOTypes.BOOLEAN, 1);
		addInput("IN04_Stop_Button", IOTypes.BOOLEAN, 1);
		addInput("IN05", IOTypes.BOOLEAN, 1);
		addInput("IN06", IOTypes.BOOLEAN, 1);
		addInput("IN07", IOTypes.BOOLEAN, 1);
		addInput("IN09", IOTypes.BOOLEAN, 1);
		addInput("IN08", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o01SelfEnable", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o02SelfStart", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o03ActiveInterface", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o04AppReadyToStart", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o05Error", IOTypes.BOOLEAN, 1);
		addDigitalOutput("AE_o06StationError", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT07", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT08", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT09_RedLight", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT10_GreenLight", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT11_BlueLight", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT12_StartBtnGreen", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT13_StartBtnRed", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT14_StopBtnGreen", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT15_StopBtnRed", IOTypes.BOOLEAN, 1);
		addDigitalOutput("OUT16", IOTypes.BOOLEAN, 1);
		addInput("IN10", IOTypes.BOOLEAN, 1);
		addInput("IN11", IOTypes.BOOLEAN, 1);
		addInput("IN12", IOTypes.BOOLEAN, 1);
		addInput("IN13", IOTypes.BOOLEAN, 1);
		addInput("IN14", IOTypes.BOOLEAN, 1);
		addInput("IN15", IOTypes.BOOLEAN, 1);
		addInput("IN16", IOTypes.BOOLEAN, 1);
	}

	/**
	 * Gets the value of the <b>digital input '<i>AE_i02Start</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'AE_i02Start'
	 */
	public boolean getAE_i02Start()
	{
		return getBooleanIOValue("AE_i02Start", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>AE_i01Enable</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'AE_i01Enable'
	 */
	public boolean getAE_i01Enable()
	{
		return getBooleanIOValue("AE_i01Enable", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN03_Start_Button</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN03_Start_Button'
	 */
	public boolean getIN03_Start_Button()
	{
		return getBooleanIOValue("IN03_Start_Button", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN04_Stop_Button</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN04_Stop_Button'
	 */
	public boolean getIN04_Stop_Button()
	{
		return getBooleanIOValue("IN04_Stop_Button", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN05</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN05'
	 */
	public boolean getIN05()
	{
		return getBooleanIOValue("IN05", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN06</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN06'
	 */
	public boolean getIN06()
	{
		return getBooleanIOValue("IN06", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN07</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN07'
	 */
	public boolean getIN07()
	{
		return getBooleanIOValue("IN07", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN09</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN09'
	 */
	public boolean getIN09()
	{
		return getBooleanIOValue("IN09", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN08</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN08'
	 */
	public boolean getIN08()
	{
		return getBooleanIOValue("IN08", false);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o01SelfEnable</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o01SelfEnable'
	 */
	public boolean getAE_o01SelfEnable()
	{
		return getBooleanIOValue("AE_o01SelfEnable", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o01SelfEnable</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o01SelfEnable'
	 */
	public void setAE_o01SelfEnable(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o01SelfEnable", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o02SelfStart</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o02SelfStart'
	 */
	public boolean getAE_o02SelfStart()
	{
		return getBooleanIOValue("AE_o02SelfStart", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o02SelfStart</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o02SelfStart'
	 */
	public void setAE_o02SelfStart(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o02SelfStart", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o03ActiveInterface</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o03ActiveInterface'
	 */
	public boolean getAE_o03ActiveInterface()
	{
		return getBooleanIOValue("AE_o03ActiveInterface", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o03ActiveInterface</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o03ActiveInterface'
	 */
	public void setAE_o03ActiveInterface(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o03ActiveInterface", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o04AppReadyToStart</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o04AppReadyToStart'
	 */
	public boolean getAE_o04AppReadyToStart()
	{
		return getBooleanIOValue("AE_o04AppReadyToStart", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o04AppReadyToStart</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o04AppReadyToStart'
	 */
	public void setAE_o04AppReadyToStart(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o04AppReadyToStart", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o05Error</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o05Error'
	 */
	public boolean getAE_o05Error()
	{
		return getBooleanIOValue("AE_o05Error", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o05Error</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o05Error'
	 */
	public void setAE_o05Error(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o05Error", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>AE_o06StationError</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'AE_o06StationError'
	 */
	public boolean getAE_o06StationError()
	{
		return getBooleanIOValue("AE_o06StationError", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>AE_o06StationError</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'AE_o06StationError'
	 */
	public void setAE_o06StationError(java.lang.Boolean value)
	{
		setDigitalOutput("AE_o06StationError", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT07</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT07'
	 */
	public boolean getOUT07()
	{
		return getBooleanIOValue("OUT07", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT07</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT07'
	 */
	public void setOUT07(java.lang.Boolean value)
	{
		setDigitalOutput("OUT07", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT08</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT08'
	 */
	public boolean getOUT08()
	{
		return getBooleanIOValue("OUT08", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT08</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT08'
	 */
	public void setOUT08(java.lang.Boolean value)
	{
		setDigitalOutput("OUT08", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT09_RedLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT09_RedLight'
	 */
	public boolean getOUT09_RedLight()
	{
		return getBooleanIOValue("OUT09_RedLight", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT09_RedLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT09_RedLight'
	 */
	public void setOUT09_RedLight(java.lang.Boolean value)
	{
		setDigitalOutput("OUT09_RedLight", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT10_GreenLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT10_GreenLight'
	 */
	public boolean getOUT10_GreenLight()
	{
		return getBooleanIOValue("OUT10_GreenLight", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT10_GreenLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT10_GreenLight'
	 */
	public void setOUT10_GreenLight(java.lang.Boolean value)
	{
		setDigitalOutput("OUT10_GreenLight", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT11_BlueLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT11_BlueLight'
	 */
	public boolean getOUT11_BlueLight()
	{
		return getBooleanIOValue("OUT11_BlueLight", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT11_BlueLight</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT11_BlueLight'
	 */
	public void setOUT11_BlueLight(java.lang.Boolean value)
	{
		setDigitalOutput("OUT11_BlueLight", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT12_StartBtnGreen</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT12_StartBtnGreen'
	 */
	public boolean getOUT12_StartBtnGreen()
	{
		return getBooleanIOValue("OUT12_StartBtnGreen", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT12_StartBtnGreen</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT12_StartBtnGreen'
	 */
	public void setOUT12_StartBtnGreen(java.lang.Boolean value)
	{
		setDigitalOutput("OUT12_StartBtnGreen", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT13_StartBtnRed</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT13_StartBtnRed'
	 */
	public boolean getOUT13_StartBtnRed()
	{
		return getBooleanIOValue("OUT13_StartBtnRed", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT13_StartBtnRed</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT13_StartBtnRed'
	 */
	public void setOUT13_StartBtnRed(java.lang.Boolean value)
	{
		setDigitalOutput("OUT13_StartBtnRed", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT14_StopBtnGreen</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT14_StopBtnGreen'
	 */
	public boolean getOUT14_StopBtnGreen()
	{
		return getBooleanIOValue("OUT14_StopBtnGreen", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT14_StopBtnGreen</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT14_StopBtnGreen'
	 */
	public void setOUT14_StopBtnGreen(java.lang.Boolean value)
	{
		setDigitalOutput("OUT14_StopBtnGreen", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT15_StopBtnRed</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT15_StopBtnRed'
	 */
	public boolean getOUT15_StopBtnRed()
	{
		return getBooleanIOValue("OUT15_StopBtnRed", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT15_StopBtnRed</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT15_StopBtnRed'
	 */
	public void setOUT15_StopBtnRed(java.lang.Boolean value)
	{
		setDigitalOutput("OUT15_StopBtnRed", value);
	}

	/**
	 * Gets the value of the <b>digital output '<i>OUT16</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital output 'OUT16'
	 */
	public boolean getOUT16()
	{
		return getBooleanIOValue("OUT16", true);
	}

	/**
	 * Sets the value of the <b>digital output '<i>OUT16</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital output
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @param value
	 *            the value, which has to be written to the digital output 'OUT16'
	 */
	public void setOUT16(java.lang.Boolean value)
	{
		setDigitalOutput("OUT16", value);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN10</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN10'
	 */
	public boolean getIN10()
	{
		return getBooleanIOValue("IN10", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN11</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN11'
	 */
	public boolean getIN11()
	{
		return getBooleanIOValue("IN11", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN12</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN12'
	 */
	public boolean getIN12()
	{
		return getBooleanIOValue("IN12", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN13</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN13'
	 */
	public boolean getIN13()
	{
		return getBooleanIOValue("IN13", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN14</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN14'
	 */
	public boolean getIN14()
	{
		return getBooleanIOValue("IN14", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN15</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN15'
	 */
	public boolean getIN15()
	{
		return getBooleanIOValue("IN15", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>IN16</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'IN16'
	 */
	public boolean getIN16()
	{
		return getBooleanIOValue("IN16", false);
	}

}
