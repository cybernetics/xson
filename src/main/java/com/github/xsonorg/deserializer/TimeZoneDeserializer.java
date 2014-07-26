package com.github.xsonorg.deserializer;

import java.util.TimeZone;

import com.github.xsonorg.ReaderModel;
import com.github.xsonorg.XsonReader;
import com.github.xsonorg.util.ByteUtils;

public class TimeZoneDeserializer implements XsonReader {
	@Override
	public Object read(ReaderModel model) {
		byte[] value = model.getValue();
		int length = ByteUtils.byteToInt(value[model.getIndex() + 1]);
		model.incrementIndex(2);
		// String str = new String(value, model.getIndex(), length,
		// model.getCharset());
		String str = model.decode(value, model.getIndex(), length);
		TimeZone returnValue = TimeZone.getTimeZone(str);
		model.appendObject(returnValue);
		model.incrementIndex(length);
		return returnValue;
	}
}