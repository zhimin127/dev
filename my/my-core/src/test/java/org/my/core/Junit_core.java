package org.my.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.my.core.util.UUIDGenerator;

public class Junit_core {
protected final Log logger = LogFactory.getLog(getClass());
	
	@Test
	public void user(){
		logger.info("junit:"+UUIDGenerator.generate());
	}
}
