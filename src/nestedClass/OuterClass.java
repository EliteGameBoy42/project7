package nestedClass;

public class OuterClass {
    InnerClassA innerA = new InnerClassA();

    public void outerMethodA() {
        System.out.println("OuterClassA MethodA");
        innerA.InnerAMethodA();
    }

    public void outerAMethodB() {
        System.out.println("OuterClassA MethodB");
    }
    public class InnerClassA {
        public void InnerAMethodA() {
            System.out.println("InnerA MethodA");
        }

        public void InnerMethodB() {
            System.out.println("InnerA MethodB");
        }
    }

    public class InnerClassB {
        public void InnerBMethodA() {
            System.out.println("InnerB MethodA");
        }

        public void InnerBMethodB() {
            System.out.println("InnerB MethodB");
        }
    }
}//outer class close body

