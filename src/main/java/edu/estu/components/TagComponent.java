package edu.estu.components;

import edu.estu.entities.concretes.Tag;

import java.util.HashSet;
import java.util.List;

public class TagComponent {

    static HashSet<Tag> createTagList(){
        HashSet<Tag> tagList = new HashSet<Tag>(3);


        System.out.println("***************************** TAGS *****************************");
        System.out.println("Please input the tag of the recipe: ");
        System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
        System.out.println("|   4. SALTY                5. BITTER               6. FRESH    |");
        System.out.println("|   7. COLD                 8. HOT                  9. QUICK    |");
        System.out.println("|   10. EASY                11. HARD                12. HEALTHY |");
        System.out.println("|   13. UNHEALTHY           14. VEGETARIAN          15. VEGAN   |");
        System.out.println("|   16. GLUTEN_FREE         17. NONE                            |");


        while (tagList.size() < 3) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if(choice == 17) break;
            switch (choice) {
                case 1:
                    tagList.add(Tag.SPICY);
                    break;
                case 2:
                    tagList.add(Tag.SWEET);
                    break;
                case 3:
                    tagList.add(Tag.SOUR);
                    break;
                case 4:
                    tagList.add(Tag.SALTY);
                    break;
                case 5:
                    tagList.add(Tag.BITTER);
                    break;
                case 6:
                    tagList.add(Tag.FRESH);
                    break;
                case 7:
                    tagList.add(Tag.COLD);
                    break;
                case 8:
                    tagList.add(Tag.HOT);
                    break;
                case 9:
                    tagList.add(Tag.QUICK);
                    break;
                case 10:
                    tagList.add(Tag.EASY);
                    break;
                case 11:
                    tagList.add(Tag.HARD);
                    break;
                case 12:
                    tagList.add(Tag.HEALTHY);
                    break;
                case 13:
                    tagList.add(Tag.UNHEALTHY);
                    break;
                case 14:
                    tagList.add(Tag.VEGETARIAN);
                    break;
                case 15:
                    tagList.add(Tag.VEGAN);
                    break;
                case 16:
                    tagList.add(Tag.GLUTEN_FREE);
                    break;
                case 17:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        return tagList;
    }
}
