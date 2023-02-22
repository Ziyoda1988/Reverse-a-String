class Main {
  
 public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(reverse("Hi"));
        System.out.println(reverse("h"));
        System.out.println(reverse(".tuo erugif nac uoy tahw tuoba s'ti ;wonk uoy tahw tuoba t'nsi gnimmargorP"));

    }          //why my code exicuting horizontal ???

                                     
    // Don't change the method name or return type, otherwise the unit tests fail
    public static String reverse(String str){

        //implement here
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        return ""; 
    }
}