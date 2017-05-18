package com.github.guolll.design.command;

/**
 * 遥控器类
 * 命令调用（发起）者：无需关心命令执行过程，只需接收结果
 */
public class TeleController {

    /**
     * 要控制的电视机，命令接收（执行）者
     */
    private Television television;

    /**
     * 开机命令
     */
    private Command openCommand;

    /**
     * 关机命令
     */
    private Command closeCommand;

    /**
     * 换频道命令
     */
    private Command changeCommand;

    /**
     * @param television 用控制的电视剧，如有多种电视，可以传不同对象，已达到控制不同电视的目的
     */
    public TeleController(Television television) {
        this.television = television;
        this.openCommand = new OpenCommand(this.television);
        this.closeCommand = new CloseCommand(this.television);
        this.changeCommand = new ChangeCommand(this.television);
    }

    /**
     * 发起开机命令
     */
    public void open() {
        openCommand.execute();
    }

    /**
     * 发起关机命令
     */
    public void close() {
        closeCommand.execute();
    }

    /**
     * 发起换频道命令
     */
    public void change() {
        changeCommand.execute();
    }
}
