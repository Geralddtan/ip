package duke.command;

import duke.DukeException;
import duke.managers.FileManager;
import duke.managers.TaskList;

public class MarkCommand extends Command{
    int taskIdx;

    public MarkCommand(String userTaskString, int taskIdx) {
        super(userTaskString);
        this.taskIdx = taskIdx;
    }

    /**
     * Marks user task as per taskIdx.
     * @param taskList
     * @param fileManager
     * @throws DukeException
     */
    public void executeTask(TaskList taskList, FileManager fileManager) throws DukeException {
        taskList.markTaskDone(taskIdx, true);
    }
}

