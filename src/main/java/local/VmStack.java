package local;

import java.util.Stack;

/**
 * 虚拟机栈
 */
public class VmStack {

    private Stack<StackFrame> stack = new Stack<StackFrame>();

    /**
     * 创建新栈帧
     */
    public StackFrame newFrame () {
        StackFrame frame = new StackFrame();
        stack.push(frame);
        return frame;
    }

    /**
     * 获取当前栈帧
     */
    public StackFrame currentFrame () {
        return stack.peek();
    }

    /**
     * 出栈当前栈帧
     */
    public StackFrame popFrame () {
        return stack.pop();
    }

}
