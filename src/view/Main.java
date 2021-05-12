package view;

import controller.Manager;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Xin chào");
            Manager manager = new Manager();
            Scanner cty = new Scanner(System.in);
            while (true){
                System.out.println("Mời lựa chọn: \n" +
                        " 1. Thêm nhân viên \n" +
                        " 2. Sửa nhân viên \n" +
                        " 3. Xoá nhân viên \n" +
                        " 4. Hiển thị danh sách nhân viên \n" +
                        " 5. Quản lý chấm công \n" +
                        " 6. Xem công \n" +
                        " 7. Xem Lương \n" +
                        " 8. Thoát \n" +
                        " 9. Tìm kiếm \n" +
                        " 10. Lưu dữ liệu \n" +
                        " 11. Lấy dữ liệu") ;


                int choose = cty.nextInt();

                switch (choose){
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
                        break;
                    case 6:
                        System.out.println("Nhập id nhân viên cần xem công");
                        manager.showCong(cty.next());
                        break;
                    case 7:
                        System.out.println("Nhập Id để xem lương: ");
                        manager.luong(cty.next());
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    case 9:
                        System.out.println("Nhập id cần tìm: ");
                        manager.findEmployee(cty.next());
                        break;
                    case 10:
                        manager.writeFile();
                        break;
                    case 11:
                        manager.readFile();
                        break;
                    default:
                        System.out.println("Không có trong yêu cầu !");
                        break;
                }
            }
        }
    }




