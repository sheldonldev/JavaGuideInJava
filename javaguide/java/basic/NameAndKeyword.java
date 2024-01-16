package javaguide.java.basic;
import java.util.Arrays;
import java.util.List;

public class NameAndKeyword {
    static public void main(String[] args) {
    }
}

class Identifier {
    /*
     * identifier is a name given to a variable, method,
     * class, package, or other program element.
     * AKA: "标志符"
     */
}

class Modifier {
     /*
      * modifier is a keyword that is used to modify the declaration 
      * of classes, methods, fields, and other elements in a program.
      * AKA: "修饰符"
      */

    static List<String> accessModifierList = Arrays.asList(
        // 1. for class accessible by any other class.
        // 2. for attributes, methods, and constructors accessible for all classes.
        "public",

        // 1. for class only accessible by classes in the same package.
        // 2. for attributes, methods, and constructors only accessible in the same package.
        // AKA: package-private
        "default", // or not modified

        // for attributes, methods, and constructors only accessible within the class.
        "private",

        // for attributes, methods, and constructors only accessible in the same package, or by subclasses even not in the same package.
        "protected"
    );
    static List<String> nonAccessModifierList = Arrays.asList(
        // 1. class cannot be extended
        // 2. method cannot be overridden
        "final",

        // 1. part of the class, can not be instantiated, not an object.
        // 2. the memory is allocated at the time of class loading, more efficient.
        // 3. is available outside any particular instance of the class.
        "static",

        // 1. cannot be used with static, final, or private
        // 2. an object cannot be created directly from that class
        // 3. Any subclass needs to be either implement all the methods of the abstract class, or it should also need to be an abstract class
        "abstract",

        // prevents a block of code from executing by multiple threads
        "synchronized",

        // 1. variable's value may be changed by multiple threads simultaneously. It prevents caching of the variable's value by threads.
        // 2. reduces the chance of memory inconsistency.
        // 3. always read from the main memory and not from the local thread cache, and it helps to improve thread performance.
        // 4. to be thread-safe, use synchronized keyword, monitors, and concurrency techniques.
        "volatile",

        // the member variable (like password) should not be serialized when the containing class instance is serialized.
        "transient",

        // the method is implemented in a language other than Java (e.g. using the shared DLL file).
        "native",

        // restrict the precision and rounding of floating point calculations, get exactly the same results from your floating point calculations on every platform.
        "strictfp"
    );

}

class BasicDataType {
    static List<String> dataTypeList = Arrays.asList(
        "byte",
        "short",
        "int",
        "long",

        "char",

        "boolean"
    );
}

class ErrorHandler {
    static List<String> dataTypeList = Arrays.asList(
        "try",
        "catch",
        "throw",
        "throws",
        "finally"
    );
}

class Controller {
    static List<String> dataTypeList = Arrays.asList(
        "break",
        "continue",
        "return",
        "do",
        "while",
        "if",
        "else",
        "for",
        "instanceof",
        "switch",
        "case",
        "default",
        "assert"
    );
}

class VariableReference {
    static List<String> dataTypeList = Arrays.asList(
        "super",
        "this",
        "void"
    );
}

class OOPRelated {
    static List<String> dataTypeList = Arrays.asList(
        "new",
        "class",
        "extends",
        "interface",
        "implements"
    );
}

class PackageRelated{
    static List<String> dataTypeList = Arrays.asList(
        "import",
        "package"
    );
}

class NotInUse {
    static List<String> dataTypeList = Arrays.asList(
        "goto", // deprecated
        "const" // deprecated, use 'final' instead
    );
}
