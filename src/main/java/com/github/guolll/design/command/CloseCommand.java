package com.github.guolll.design.command;

/**
 * 具体命令，关机
 */
public class CloseCommand implements Command {

    private Television television;

    public CloseCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.close();
    }
}
