public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        
        System.out.println("Enter array values:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                arr[i] = 0;
            }
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
        
    }
	
	//Same method can be used for odd negative or positibe values