package org.xson.core.deserializer;

import org.xson.core.ReaderModel;
import org.xson.core.XsonReader;

public class FloatDeserializer implements XsonReader {
	@Override
	public Object read(ReaderModel model) {
		// model.wrapToBasic();
		// Float returnValue = model.getFloat();
		Float returnValue = model.getFloatWrap();
		model.appendObject(returnValue);
		return returnValue;
	}
}
