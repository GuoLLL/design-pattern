package com.github.guolll.design.command;

/**
 * 具体命令，开机
 */
public class OpenCommand implements Command {

    private Television television;

    public OpenCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.open();
    }
}
