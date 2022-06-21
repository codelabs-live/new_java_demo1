//public class NewClass {
//    public static void main(String[] args) {
//        System.out.println("Demo");
//        System.out.print("Demo");
//        char c ='v';
//        System.out.println(c);
//        String name ="Demo";
//        System.out.println(name.concat("Demo").concat("Demo").concat("Demo").length());
//        int a = 8;
//        int b = 7;
//        double d = 7.8;
//        float f = 7f;
//        boolean isTrue = true;
//         var name1 = "Demo";
//
//
//        System.out.println(name+name1);
//        System.out.println(a+b);
////         name1 = 45;
//    }
//}


public  class NewClass {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5,6};
//        int b[] = new int[4];
//        b[1]=6;
////        System.out.println(b[1]);
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }


        int a[][] = new int[2][3];
        a[0][0]=0;
        a[0][1]=1;
        for (int i = 0;i<2;i++){
            for (int j =0;j<3;j++){
                System.out.print(a[i][j]+" ");
//                c[0][0]= a[0][0]+b[0][0];
            }
            System.out.println();
        }

        System.out.println(a);
    }
}
