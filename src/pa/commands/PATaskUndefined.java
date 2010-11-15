package pa.commands;

import pa.constants.PACommand;

public class PATaskUndefined extends PATask {

	public PATaskUndefined() throws Exception {
		this.command = PACommand.UNDEFINED;
		throw new Exception("Undefined Command: No Arguments!");
	}
	public PATaskUndefined(String[] args) throws Exception{
		super(args);
		this.command = PACommand.UNDEFINED;
	}
	
	@Override
	public void execute(){
		//throw new Exception("Undefined Command");
	}

}
