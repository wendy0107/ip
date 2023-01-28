package duke.command;

import duke.TaskList;
import duke.Ui;

public class ByeCommand extends Command {
    public static final String BYE_COMMAND = "bye";

    public ByeCommand() {
        super(BYE_COMMAND);
    }

    @Override
    public void execute(TaskList lst, Ui ui) {
        ui.showExit();
    }
}