package view;

import controller.Manager;
import model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("Xin chào");
            Manager manager = new Manager();
            Scanner cty = new Scanner(System.in);
            while (true) {
                System.out.println("Mời lựa chọn: \n" +
                        " 1. Thêm nhân viên \n" +
                        " 2. Sửa nhân viên \n" +
                        " 3. Xoá nhân viên \n" +
                        " 4. Hiển thị danh sách nhân viên \n" +
                        " 5. Quản lý chấm công \n" +
                        " 6. Tìm kiếm \n" +
                        " 7. Lưu dữ liệu \n" +
                        " 8. Lấy dữ liệu \n" +
                        " 9. Xem công \n" +
                        " 10. Xem Lương \n" +
                        " 11. Thoát ");


                int choose = cty.nextInt();

                switch (choose) {
                    case 1:
                        manager.addEmployee();
                        break;
                    case 2:
                        System.out.println("Mời nhập id nhân viên cần sửa");
                        manager.editEmployee(cty.next());
                        break;
                    case 3:
                        System.out.println("Mời nhập id nhân viên cần xoá");
                        manager.deleteEmployee(cty.next());
                        break;
                    case 4:
                        manager.showEmployee();
                        break;
                    case 5:
                        System.out.println("Mời nhập id nhân viên cần quản lý");
                        manager.timeSheet(cty.next());
                    case 6:
                        System.out.println("Nhập id cần tìm: ");
                        manager.findEmployee(cty.next());
                        break;
                    case 7:
                        manager.writeFile();
                        break;
                    case 8:
                        manager.readFile();
                        break;
                    case 9:
                        manager.showCong(cty.next());
                        break;
                    case 10:
                        manager.luong(cty.next());
                    case 11:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có trong yêu cầu !");
                        break;
                }
            }

        }
    }





