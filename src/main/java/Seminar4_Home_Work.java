import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Seminar4_Home_Work {
    public static void main(String[] args) {
        ArrayList<String> list_name = new ArrayList<>();
        ArrayList<String> list_surname = new ArrayList<>();
        ArrayList<String> gender_list = new ArrayList<>();
        ArrayList<Integer> age_list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество человек в базе данных");
        int person_numbers = scanner.nextInt();
        //scanner.close();


        for(int i=0; i<person_numbers;i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = scan.nextLine();
            list_name.add(name);
           //scan.close();
            System.out.println("Введите фамилию");
            Scanner scan1 = new Scanner(System.in);
            String surname = scan1.nextLine();
            list_surname.add(surname);
            //scan1.close();
            System.out.println(("Введите пол (мужской) или (женский) "));
            Scanner scan2 = new Scanner(System.in);
            String gender = scan2.nextLine();
            gender_list.add(gender);
            //scan2.close();
            System.out.println("Введите возраст пользователя ");
            Scanner scan3 = new Scanner(System.in);
            int age = scan3.nextInt();
            age_list.add(age);
            //scan3.close();

        }
        ArrayList<String> data_base = new ArrayList<>();
        for(int i = 0; i<person_numbers;i++){

            data_base.add(i+". "+list_name.get(i)+" "+list_surname.get(i)+" "+gender_list.get(i)+" "+age_list.get(i));

        }
        data_base.forEach(m -> System.out.println(m));
        ArrayList<Integer> index_person_age = new ArrayList<>();
        ArrayList<Integer> index_person_list = new ArrayList<>();
        for(int i = 0;i<data_base.size();i++) {
            index_person_age.add(Integer.decode((data_base.get(i)).substring(data_base.get(i).length()-2,data_base.get(i).length())));
            index_person_list.add(Integer.decode((data_base.get(i)).substring(0,1)));
        }

        ArrayList<Integer> copy_list_age = (ArrayList<Integer>)index_person_age.clone();
        Collections.sort(copy_list_age);
        copy_list_age.forEach(i -> System.out.println(i));

        ArrayList<String> data_base_result = new ArrayList<>();
        int n = 0;
        for (int i =0;i<data_base.size();i++){
            n = index_person_age.indexOf(copy_list_age.get(i));
            data_base_result.add(i, data_base.get(n));
            }
        System.out.println("список пользователей, отсортированный по возрасту:");
        data_base_result.forEach(i -> System.out.println(i));
        }
    }

