public class StringchaarAT {
    public static void StringchaarAT(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }    
    public static void main(String args[]){
        String firstname = "Parth";
        String lastname = "Sharma";
        String fullName = firstname + " " + lastname;
        System.out.println(fullName.charAt(3));
    }
}
