//Java practical06
//String in java 
//String using new
public class StringNewExample {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        System.out.println("String created using new: " + str);
    }
}

//String usingLitral
public class StringLiteralExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("String created using literal: " + str);
    }
}
//String using Buffer
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello, ");
        buffer.append("World!");
        System.out.println("String created using StringBuffer: " + buffer.toString());
    }
}
//StringBuilder
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append("World!");
        System.out.println("String created using StringBuilder: " + builder.toString());
    }
}

