package org.openpnp.libuvc4j;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.openpnp.libuvc4j.UvcLibrary.uvc_vs_desc_subtype;
/**
 * <i>native declaration : /usr/local/Cellar/libuvc/HEAD/include/libuvc/libuvc.h:87</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("uvc") 
public class uvc_frame_desc extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : uvc_format_desc* */
	@Field(0) 
	public Pointer<uvc_format_desc > parent() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : uvc_format_desc* */
	@Field(0) 
	public uvc_frame_desc parent(Pointer<uvc_format_desc > parent) {
		this.io.setPointerField(this, 0, parent);
		return this;
	}
	/** C type : uvc_frame_desc* */
	@Field(1) 
	public Pointer<uvc_frame_desc > prev() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : uvc_frame_desc* */
	@Field(1) 
	public uvc_frame_desc prev(Pointer<uvc_frame_desc > prev) {
		this.io.setPointerField(this, 1, prev);
		return this;
	}
	/** C type : uvc_frame_desc* */
	@Field(2) 
	public Pointer<uvc_frame_desc > next() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : uvc_frame_desc* */
	@Field(2) 
	public uvc_frame_desc next(Pointer<uvc_frame_desc > next) {
		this.io.setPointerField(this, 2, next);
		return this;
	}
	/** C type : uvc_vs_desc_subtype */
	@Field(3) 
	public IntValuedEnum<uvc_vs_desc_subtype > bDescriptorSubtype() {
		return this.io.getEnumField(this, 3);
	}
	/** C type : uvc_vs_desc_subtype */
	@Field(3) 
	public uvc_frame_desc bDescriptorSubtype(IntValuedEnum<uvc_vs_desc_subtype > bDescriptorSubtype) {
		this.io.setEnumField(this, 3, bDescriptorSubtype);
		return this;
	}
	@Field(4) 
	public byte bFrameIndex() {
		return this.io.getByteField(this, 4);
	}
	@Field(4) 
	public uvc_frame_desc bFrameIndex(byte bFrameIndex) {
		this.io.setByteField(this, 4, bFrameIndex);
		return this;
	}
	@Field(5) 
	public byte bmCapabilities() {
		return this.io.getByteField(this, 5);
	}
	@Field(5) 
	public uvc_frame_desc bmCapabilities(byte bmCapabilities) {
		this.io.setByteField(this, 5, bmCapabilities);
		return this;
	}
	@Field(6) 
	public short wWidth() {
		return this.io.getShortField(this, 6);
	}
	@Field(6) 
	public uvc_frame_desc wWidth(short wWidth) {
		this.io.setShortField(this, 6, wWidth);
		return this;
	}
	@Field(7) 
	public short wHeight() {
		return this.io.getShortField(this, 7);
	}
	@Field(7) 
	public uvc_frame_desc wHeight(short wHeight) {
		this.io.setShortField(this, 7, wHeight);
		return this;
	}
	@Field(8) 
	public int dwMinBitRate() {
		return this.io.getIntField(this, 8);
	}
	@Field(8) 
	public uvc_frame_desc dwMinBitRate(int dwMinBitRate) {
		this.io.setIntField(this, 8, dwMinBitRate);
		return this;
	}
	@Field(9) 
	public int dwMaxBitRate() {
		return this.io.getIntField(this, 9);
	}
	@Field(9) 
	public uvc_frame_desc dwMaxBitRate(int dwMaxBitRate) {
		this.io.setIntField(this, 9, dwMaxBitRate);
		return this;
	}
	@Field(10) 
	public int dwMaxVideoFrameBufferSize() {
		return this.io.getIntField(this, 10);
	}
	@Field(10) 
	public uvc_frame_desc dwMaxVideoFrameBufferSize(int dwMaxVideoFrameBufferSize) {
		this.io.setIntField(this, 10, dwMaxVideoFrameBufferSize);
		return this;
	}
	@Field(11) 
	public int dwDefaultFrameInterval() {
		return this.io.getIntField(this, 11);
	}
	@Field(11) 
	public uvc_frame_desc dwDefaultFrameInterval(int dwDefaultFrameInterval) {
		this.io.setIntField(this, 11, dwDefaultFrameInterval);
		return this;
	}
	@Field(12) 
	public int dwMinFrameInterval() {
		return this.io.getIntField(this, 12);
	}
	@Field(12) 
	public uvc_frame_desc dwMinFrameInterval(int dwMinFrameInterval) {
		this.io.setIntField(this, 12, dwMinFrameInterval);
		return this;
	}
	@Field(13) 
	public int dwMaxFrameInterval() {
		return this.io.getIntField(this, 13);
	}
	@Field(13) 
	public uvc_frame_desc dwMaxFrameInterval(int dwMaxFrameInterval) {
		this.io.setIntField(this, 13, dwMaxFrameInterval);
		return this;
	}
	@Field(14) 
	public int dwFrameIntervalStep() {
		return this.io.getIntField(this, 14);
	}
	@Field(14) 
	public uvc_frame_desc dwFrameIntervalStep(int dwFrameIntervalStep) {
		this.io.setIntField(this, 14, dwFrameIntervalStep);
		return this;
	}
	@Field(15) 
	public byte bFrameIntervalType() {
		return this.io.getByteField(this, 15);
	}
	@Field(15) 
	public uvc_frame_desc bFrameIntervalType(byte bFrameIntervalType) {
		this.io.setByteField(this, 15, bFrameIntervalType);
		return this;
	}
	@Field(16) 
	public int dwBytesPerLine() {
		return this.io.getIntField(this, 16);
	}
	@Field(16) 
	public uvc_frame_desc dwBytesPerLine(int dwBytesPerLine) {
		this.io.setIntField(this, 16, dwBytesPerLine);
		return this;
	}
	/** C type : uint32_t* */
	@Field(17) 
	public Pointer<Integer > intervals() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : uint32_t* */
	@Field(17) 
	public uvc_frame_desc intervals(Pointer<Integer > intervals) {
		this.io.setPointerField(this, 17, intervals);
		return this;
	}
	public uvc_frame_desc() {
		super();
	}
	public uvc_frame_desc(Pointer pointer) {
		super(pointer);
	}
}
