class ArrayDemo24{

        void fun(int[] arr){

                arr[1] = 19;
                arr[2] = 4;
        }

        public static void main(String[] args){

                int arr[] = {10,20,30,40};

                System.out.println(System.identityHashCode(arr[0]));
                 System.out.println(System.identityHashCode(arr[1]));
                  System.out.println(System.identityHashCode(arr[2]));
                   System.out.println(System.identityHashCode(arr[3]));

        }

}                                               
