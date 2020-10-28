package local;

/**
 * 栈帧
 */
public class StackFrame {

    /**
     * 局部变量表
     */
    private Object localVariables;

    /**
     * 操作数栈
     */
    private Object operandStack;

    /**
     * 字节码
     */
    private Object opcodes;

    /**
     * 程序计数器
     */
    private Object constantPool = 0;

    /**
     * 程序计数器
     */
    private int pc = 0;

    /**
     * 返回值
     */
    private Object returnVal;
}
