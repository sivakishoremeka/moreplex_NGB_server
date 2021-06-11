package org.mifosplatform.celcom.handler;

import org.mifosplatform.celcom.service.CelcomWritePlatformService;
import org.mifosplatform.commands.annotation.CommandType;
import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@CommandType(entity = "CELCOMCLIENTSIMPLEACTIVATION", action = "CREATE")

public class createCelcomClientSimpleActivationCommandHandler implements NewCommandSourceHandler {

private final CelcomWritePlatformService celcomWritePlatformService;	
	
	@Autowired	
	public createCelcomClientSimpleActivationCommandHandler(final CelcomWritePlatformService celcomWritePlatformService) {
	
		this.celcomWritePlatformService = celcomWritePlatformService;
	}

	@Override
	public CommandProcessingResult processCommand(JsonCommand command) {
		return this.celcomWritePlatformService.createClientSimpleActivation(command);
	}
	
	
}
