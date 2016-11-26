package xyz.sidetrip.events;

import sx.blah.discord.api.events.Event;
import xyz.sidetrip.commands.InputWizard;

public class WizardEndEvent extends Event{
	
	private final InputWizard wizard;
	
	public WizardEndEvent(InputWizard wizard){
		this.wizard = wizard;
	}
	
	public InputWizard getWizard(){
		return wizard;
	}

}
