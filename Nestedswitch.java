import java.util.Scanner;
public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter roll number");
        int rno = in.nextInt();
        System.out.println("Enter Department IT or Comp");
        String department = in.next();
        System.out.println("Name:");
        switch (department) {
            case "IT":{
                switch (rno) {
                    case 1:{
                        System.out.println("Vedant");
                    }break;
                    case 2:{
                        System.out.println("Shyam");
                    }break;
                    default:
                        break;
                }
            }break;
            case "Comp":{
                switch(rno){
                    case 1:{
                        System.out.println("Baburao");
                    }break;
                    case 2:{
                        System.out.println("Raju");
                    }break;
                    default:
                        break;
                }
            }break;
        
            default:{}
                break;
        }
        in.close();
    }
}
