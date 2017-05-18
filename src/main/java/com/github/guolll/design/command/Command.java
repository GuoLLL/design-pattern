package com.github.guolll.design.command;

/**
 * Command 命令接口，所有命令必须实现它
 */
public interface Command {

    /**
     * 执行操作
     */
    void execute();
}
