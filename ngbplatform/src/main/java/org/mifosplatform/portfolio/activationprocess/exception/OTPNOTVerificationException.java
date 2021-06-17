package org.mifosplatform.portfolio.activationprocess.exception;

import org.mifosplatform.infrastructure.core.exception.AbstractPlatformDomainRuleException;

public class OTPNOTVerificationException extends AbstractPlatformDomainRuleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OTPNOTVerificationException(String mobile) {
		super("error.msg.NIN", "NIN not verified",mobile);
	}

}
