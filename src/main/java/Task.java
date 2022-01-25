public abstract class Task {
    private boolean isDone;
    private String taskDescription;
    private String tag;

    public Task (String taskDescription, String tag){
        this.taskDescription = taskDescription;
        this.isDone = false;
        this.tag = tag;
    }

    public boolean checkIsDone(){
        return this.isDone;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public void markAsNotDone(){
        this.isDone = false;
    }

    public String getTag(){
        return this.tag;
    }

    public abstract String toSaveDataFormat();

    public String toString(){
        String isDoneRepresentation;
        if (this.checkIsDone() == true) {
            isDoneRepresentation = "[Done!] ";
        } else {
            isDoneRepresentation = "[] ";
        }
        return "[" + this.getTag() + "]" + isDoneRepresentation + this.getTaskDescription();

    }

}
