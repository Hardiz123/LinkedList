import java.util.Scanner;

/**
 * Test
 */

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while (flag) {
        System.out.println();
        System.out.println("1.Add item to the list at start");
        System.out.println("2.Add item to the last at the list");
        System.out.println("3.Add Item tothe list at a position");
        System.out.println("4. Delete first item from the list");
        System.out.println("5. Delete last item from the list");
        System.out.println("6. Delete item from the list with given position");
        System.out.println("7. Insert in a sorted List");
        System.out.println("8. Find an element");
        System.out.println("9. view List");
        System.out.println("10. exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        int position,value;

        switch (choice) {
            case 1:
            System.out.println("Enter value of item");
            value = sc.nextInt();
            list.insertAtFirst(value);
                
                break;
            case 2:
            System.out.println("Enter value of item");
            value = sc.nextInt();
            list.insertAtLast(value);
                break;       
            case 3:
            System.out.println("Enter position");
            position = sc.nextInt();
            System.out.println("Enter value of item");
            value = sc.nextInt();
            list.insertAtpos(value,position);
                break;
            case 4:
            list.deleteFirst();
                break;   
            case 5:
            list.deleteLast();
                
                break;
            case 6:
                System.out.println("Enter position");
                position = sc.nextInt();
                list.deleteAtPosition(position);
                break;
            case 7:
                System.out.println("Enter value");
                value = sc.nextInt();
                list.insertInSortedList(value);
                break;
            case 8:
                System.out.println("Enter value");
                value = sc.nextInt();
                list.findElement(value);
                break;       
            case 9:
                list.viewList();
                break;
            case 10:
                flag = false;  
                break;
            default:
                System.out.println("Invalid Choice"); 
                break;    
        }
        }

        sc.close();
    }
}