import java.util.*;

public class Main{

    static void saveAcc(int total){
        ArrayList<Account> listAccount = new ArrayList<Account>();
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<total; i++){
            Account account = new Account();
            
            System.out.print("Masukkan media: ");
            String media = scan.next();
            System.out.println();
            System.out.print("Masukkan email: ");
            String email = scan.next();
            System.out.println();
            System.out.print("Masukkan password: ");
            String pswrd = scan.next();
            System.out.println();
    
            account.setMedia(media);
            account.setEmail(email);
            account.setPassword(pswrd);
            System.out.println("akun berhasil ditambahkan!");

            listAccount.add(account);
        }
            
        System.out.println("ingin menampilkan list akun yang disimpan?(Y/N)");
        String input = scan.next();
    
            switch(input){
                case "Y":
                    for(int i=0; i<total;i++){
                        System.out.println("Account "+(i+1)+":"+listAccount.get(i).getMedia()+" | "+listAccount.get(i).getEmail()+" | "+listAccount.get(i).getPassword());
                    } 
                    break;
                
                case "N":
                    break;
                
                default:
                    break;
        }     
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        Account acc = new Account();
        System.out.print("Ingin menyimpan berapa akun? ");
        int total = scan.nextInt();
        main.saveAcc(total);
  
    }
}