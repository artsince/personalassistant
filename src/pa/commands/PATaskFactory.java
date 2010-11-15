package pa.commands;

import pa.constants.PACommand;
import pa.utils.PAUtils;

public final class PATaskFactory {
	public static PATask newInstance(String[] args) throws Exception{
		
		if(args == null || args.length < 1) {
			return new PATaskUndefined();
		}
		
		PACommand command = PAUtils.getTodoAction(args[0]);
		
		switch (command) {
		case ADD:
			return new PATaskAdd(args);
		case DEBUG:
			return new PATaskDebug(args);
		case UNDEFINED:
			return new PATaskUndefined(args);
		default:
			return null;
		}
	}
}