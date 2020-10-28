package local;

import java.util.HashMap;
import java.util.Map;

/**
 * 虚拟机
 */
public class VirtualMachine {

    /**
     * 方法区
     */
    private ClassLoader classLoader;

    /**
     * 方法区
     */
    private Map<String,Clazz> methodArea = new HashMap();

    /**
     * 局部变量表
     */
    private Object localVariables;

    /**
     * 局部变量表
     */
    private Object a1;

    /**
     * 局部变量表
     */
    private Object a2;


    VirtualMachine (String path) {

    }

    public void run (String clazzName, String methodName) {
        Clazz clazz = getClass(clazzName);
        Method method = clazz.getMethod(methodName);
        method.call();
    }

    /**
     * 如果方法区没有则使用类加载器加载
     */
    public Clazz getClass (String className) {
        Clazz found = methodArea.get(className);
        if(null == found){
            found = classLoader.loadClass(className);
            methodArea.put(className, found);
        }
        return found;
    }

}
