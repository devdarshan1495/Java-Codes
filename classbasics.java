
// class basics{
//     public static void main(String args[]) {
//         try{
//             int a=args.length;
//             System.out.println("a = "+a);
//             int b=42/a;
//             int c[]={1};
//             c[40]=99;
//         }catch(ArithmeticException e)
//         {
//             System.out.println("divide by zero " +e);
//         }catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("array index OOB "+e);
//         }
//         System.out.println("After try and catch block");
//     }
//}

//
// class basics{
//      public static void main(String args[]) {
//         try{
//             int a=args.length;
//             System.out.println("a = "+a);
//             int b=42/a;
//         }catch(Exception e)
//         {
//         }catch(ArithmeticException e)           //this is unreachable part of the code since all exceptions will be caught above
//         {
//             System.out.println("this is never reached");
//         }
//     }
// }


//-------------------------------------------------------------------------------//


// class basics{
//     public static void main(String args[]) {
//        try{
//            int a=args.length;
//            System.out.println("a = "+a);
//            int b=42/a;
//        }catch(ArithmeticException e)          
//        {
//            System.out.println("this is never reached");
//        }catch(Exception e)
//        {
//        }
//    }
// }

class basics{
    public static void main(String[] args) {
        try{
            int a=args.length;          //value of a=0, this it will give array index out of bound
            int b=42/a;
            System.out.println("a = "+a);
            try{
                if(a==1) a=a/(a-a);         //division by 0
                if(a==2){
                    int c[]={11};
                    c[50]=23;
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array out of bound " +e);
            }
        }catch(ArithmeticException e){
        System.out.println("Division by 0" +e);
        }
    }
}