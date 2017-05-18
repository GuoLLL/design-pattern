package com.github.guolll.design.command;

/**
 * 具体命令，换频道
 */
public class ChangeCommand implements Command {

    private Television television;

    public ChangeCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.changeChannel();
    }
}
