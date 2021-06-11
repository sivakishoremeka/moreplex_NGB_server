package org.mifosplatform.organisation.monetary.handler;

import org.mifosplatform.commands.annotation.CommandType;
import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.mifosplatform.organisation.monetary.service.CurrencyWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@CommandType(entity = "CURRENCYS", action = "UPDATE")
public class UpdateNewCurrencyCommandHandler implements NewCommandSourceHandler {

	private final CurrencyWritePlatformService writePlatformService;

	@Autowired
	public UpdateNewCurrencyCommandHandler(final CurrencyWritePlatformService writePlatformService) {
		this.writePlatformService = writePlatformService;
	}

	@Transactional
	@Override
	public CommandProcessingResult processCommand(final JsonCommand command) {

		return this.writePlatformService.updateNewCurrency(command,command.entityId());
	
	}
	
	
}
