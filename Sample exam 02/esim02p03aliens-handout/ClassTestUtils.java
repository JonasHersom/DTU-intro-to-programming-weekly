// Do not modify this file!

// The code below inspects the structure of a class or interface
// you should have defined for the solution of this assessment.  You do
// not need to fully understand the code below --- but if you are
// curious, this code is using the Java reflection APIs documented in:
// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html

import java.lang.reflect.Modifier;

class ClassTestUtils {
    public static void checkConstructorImplPublic(Class<?> clazz,
                                                   Class<?>[] argTypes) {
        System.out.println("Class '" + clazz.getName()
                           + "' has a public constructor with argument types "
                           + formatArgs(argTypes) + "... ");
        System.out.print("    -> ");
        try {
            var cons = clazz.getDeclaredConstructor(argTypes);
            if (Modifier.isPublic(cons.getModifiers())) {
                System.out.println("true");
            } else {
                System.out.println("false (the constructor is not public)");
            }
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("false (constructor not declared)");
        }
    }

    public static void checkMethodImplPublic(Class<?> clazz, String name,
                                             Class<?>[] argTypes) {
        System.out.println("Class '" + clazz.getName()
                           + "' implements the public method " + name
                           + formatArgs(argTypes) + "...");
        System.out.print("    -> ");
        try {
            var method = clazz.getDeclaredMethod(name, argTypes);
            if (Modifier.isAbstract(method.getModifiers())) {
                System.out.println("false (the method is abstract)");
            } else if (method.getDeclaringClass() != clazz) {
                System.out.println("false (the method is inherited)");
            } else if (Modifier.isPublic(method.getModifiers())) {
                System.out.print("true");
                if (Modifier.isStatic(method.getModifiers())) {
                    System.out.println(" - and the method is static");
                } else {
                    System.out.println("");
                }
            } else {
                System.out.println("false (the method is not public)");
            }
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("false (method not declared)");
        }
    }

    public static void checkMethodInherited(Class<?> clazz, String name,
                                              Class<?>[] argTypes) {
        System.out.println("Class '" + clazz.getName()
                           + "' inherits the method " + name
                           + formatArgs(argTypes) + "... ");
        System.out.print("    -> ");
        try {
            var method = clazz.getMethod(name, argTypes);
            if (Modifier.isAbstract(method.getModifiers())) {
                System.out.println("false (the method is abstract)");
            } else if (method.getDeclaringClass() != clazz) {
                System.out.println("true (inherited from class '" + method.getDeclaringClass().getSimpleName() + "')");
            } else {
                System.out.println("false (the method is implemented by the class, not inherited)");
            }
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("false (method not declared)");
        }
    }

    public static void checkFieldImplPublic(Class<?> clazz, String name) {
        System.out.println("Class '" + clazz.getName()
                           + "' declares the public field '" + name + "'... ");
        System.out.print("    -> ");
        try {
            var field = clazz.getDeclaredField(name);
            if (field.getDeclaringClass() != clazz) {
                System.out.println("false (the field is inherited)");
            } else if (Modifier.isPublic(field.getModifiers())
                        && Modifier.isFinal(field.getModifiers())) {
                System.out.println("true --- and the field is also 'final'");
            } else if (Modifier.isPublic(field.getModifiers())) {
                System.out.println("true");
            } else {
                System.out.println("false (the field is not public)");
            }
        } catch (NoSuchFieldException | SecurityException e) {
            System.out.println("false (field not declared)");
        }
    }

    public static void checkInterface(Class <?> clazz) {
        System.out.println("'" + clazz.getName() + "' is an interface");

        System.out.print("    -> ");
        System.out.println(clazz.isInterface() ? "true" : "false");
    }

    public static void checkInterface(Class <?> clazz, String iface) {
        System.out.println("'" + clazz.getName()
                           + "' directly implements/extends interface '" + iface + "'...");
        var ifaces = clazz.getInterfaces();
        for (var i: ifaces) {
            if (i.getSimpleName().equals(iface)) {
                System.out.println("    -> true");
                return;
            }
        }
        System.out.println("    -> false");
    }

    public static void checkSuperclass(Class <?> clazz, Class <?> parent) {
        System.out.println("Class '" + clazz.getName()
                           + "' directly extends class '" + parent.getSimpleName() + "'...");
        if (clazz.getSuperclass().equals(parent)) {
            System.out.println("    -> true");
        } else {
            System.out.println("    -> false");
        }
    }

    public static void checkFieldsPrivate(Class<?> clazz) {
        checkFieldsPrivateExcept(clazz, new String[] {});
    }

    public static void checkFieldsPrivateExcept(Class<?> clazz,
                                                String[] pubFields) {
        System.out.print("Class '" + clazz.getName() + "' only has private fields");
        if (pubFields.length != 0) {
            System.out.println(", except:");
            System.out.println("    public field(s): "
                               + String.join(",", pubFields));
        } else {
            System.out.println("...");
        }

        System.out.print("    -> ");
        try {
            var fields = clazz.getDeclaredFields();
            var pubFieldsSet = java.util.Set.of(pubFields);
            var allPrivate = true;
            for (var f: fields) {
                var modifiers = f.getModifiers();
                if (!Modifier.isPrivate(modifiers)) {
                    if (Modifier.isPublic(modifiers) && pubFieldsSet.contains(f.getName())) {
                        continue;
                    }
                    allPrivate = false;
                    break;
                }
            }
            System.out.println(allPrivate ? "true" : "false");
        } catch (SecurityException e) {
            System.out.println("true");
        }
    }

    public static void checkClassAbstract(Class<?> clazz) {
        System.out.println("Class '" + clazz.getName() + "' is an abstract class");

        System.out.print("    -> ");
        if (clazz.isInterface()) {
            System.out.println("false (" + clazz.getName() + " is an interface)");
        } else if (!Modifier.isAbstract(clazz.getModifiers())) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    private static String formatArgs(Class<?>[] argTypes) {
        var result = "";
        for (var arg: argTypes) {
            if (result.length() > 0) {
                result += ", ";
            }
            result = result + arg.getSimpleName();
        }
        return "(" + result + ")";
    }
}
