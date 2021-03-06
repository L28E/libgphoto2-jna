/**
 * Copyright 2012 Andrew Bythell, abythell@ieee.org
 *
 * This file is part of libgphoto2-jna.
 *
 * libgphoto2-jna is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * libgphoto2-jna is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * libphoto2-jna. If not, see <http://www.gnu.org/licenses/>.
 */
package com.angryelectron.libgphoto2;
import com.sun.jna.Union;
/**
 * <i>native declaration : /usr/include/gphoto2/gphoto2-port.h:113</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GPPortSettings extends Union {
	/**
	 * < \brief Serial specific settings<br>
	 * C type : GPPortSettingsSerial
	 */
	public GPPortSettingsSerial serial;
	/**
	 * < \brief USB specific settings<br>
	 * C type : GPPortSettingsUSB
	 */
	public GPPortSettingsUSB usb;
	/**
	 * < \brief Disk port specific settings<br>
	 * C type : GPPortSettingsDisk
	 */
	public GPPortSettingsDisk disk;
	/**
	 * < \brief usb disk direct port specific settings<br>
	 * C type : GPPortSettingsUsbDiskDirect
	 */
	public GPPortSettingsUsbDiskDirect usbdiskdirect;
	/**
	 * < \brief usb scsi port specific settings<br>
	 * C type : GPPortSettingsUsbScsi
	 */
	public GPPortSettingsUsbScsi usbscsi;
	public GPPortSettings() {
		super();
	}
	/**
	 * @param serial < \brief Serial specific settings<br>
	 * C type : GPPortSettingsSerial
	 */
	public GPPortSettings(GPPortSettingsSerial serial) {
		super();
		this.serial = serial;
		setType(GPPortSettingsSerial.class);
	}
	/**
	 * @param usb < \brief USB specific settings<br>
	 * C type : GPPortSettingsUSB
	 */
	public GPPortSettings(GPPortSettingsUSB usb) {
		super();
		this.usb = usb;
		setType(GPPortSettingsUSB.class);
	}
	/**
	 * @param usbscsi < \brief usb scsi port specific settings<br>
	 * C type : GPPortSettingsUsbScsi
	 */
	public GPPortSettings(GPPortSettingsUsbScsi usbscsi) {
		super();
		this.usbscsi = usbscsi;
		setType(GPPortSettingsUsbScsi.class);
	}
	/**
	 * @param disk < \brief Disk port specific settings<br>
	 * C type : GPPortSettingsDisk
	 */
	public GPPortSettings(GPPortSettingsDisk disk) {
		super();
		this.disk = disk;
		setType(GPPortSettingsDisk.class);
	}
	/**
	 * @param usbdiskdirect < \brief usb disk direct port specific settings<br>
	 * C type : GPPortSettingsUsbDiskDirect
	 */
	public GPPortSettings(GPPortSettingsUsbDiskDirect usbdiskdirect) {
		super();
		this.usbdiskdirect = usbdiskdirect;
		setType(GPPortSettingsUsbDiskDirect.class);
	}
	public static class ByReference extends GPPortSettings implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends GPPortSettings implements com.sun.jna.Structure.ByValue {
		
	};
}
