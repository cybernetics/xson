package org.xson.core.serializer;

import org.xson.core.XsonException;

public class XsonSerializerException extends XsonException {

	private static final long serialVersionUID = 6638311927435425761L;

	public XsonSerializerException(String message) {
		super(message);
	}

	public XsonSerializerException(Throwable cause) {
		super(cause);
	}

	public XsonSerializerException(String message, Throwable cause) {
		super(message, cause);
	}

}
