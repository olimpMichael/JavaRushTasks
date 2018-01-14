package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        //System.out.println(modifiersOfThisClass);
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
        boolean result = false;
        switch(specificModifier){
            case Modifier.ABSTRACT:
                result = Modifier.isAbstract(allModifiers);
                break;
            case Modifier.FINAL:
                result = Modifier.isFinal(allModifiers);
                break;
            case Modifier.INTERFACE:
                result = Modifier.isInterface(allModifiers);
                break;
            case Modifier.NATIVE:
                result = Modifier.isNative(allModifiers);
                break;
            case Modifier.PRIVATE:
                result = Modifier.isPrivate(allModifiers);
                break;
            case Modifier.PROTECTED:
                result = Modifier.isProtected(allModifiers);
                break;
            case Modifier.PUBLIC:
                result = Modifier.isPublic(allModifiers);
                break;
            case Modifier.STATIC:
                result = Modifier.isStatic(allModifiers);
                break;
            case Modifier.STRICT:
                result = Modifier.isStrict(allModifiers);
                break;
            case Modifier.SYNCHRONIZED:
                result = Modifier.isSynchronized(allModifiers);
                break;
            case Modifier.TRANSIENT:
                result = Modifier.isTransient(allModifiers);
                break;
            case Modifier.VOLATILE:
                result = Modifier.isVolatile(allModifiers);
                break;
        }

        return result;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
