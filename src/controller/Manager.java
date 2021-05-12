package controller;


import model.Employee;
import strorage.TextFileFactory;


import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private TextFileFactory textFileFactory = TextFileFactory.getINSTANCE();
    private  ArrayList<Employee>employees = new ArrayList<>();
    private String id;
    private static ArrayList<Employee> emloyeeList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public Manager() {
    }

    // thêm nhân viên mới
    public void addEmployee() {

        System.out.println("Mời bạn nhập thông tin nhân viên: ");
        Scanner thongtin = new Scanner(System.in);
        System.out.println("Mời bạn nhập id nhân viên: ");
        String id;
        do {
            id = thongtin.next();
            if (!checkId(id))
                System.out.println("ID nhân viên đã tồn tại mời nhập lại");
            continue;
        } while (!checkId(id));
        Scanner thongtin1 = new Scanner(System.in);
        System.out.println("Mời bạn nhâp tên nhân viên: ");
        String name = thongtin1.nextLine();
        Scanner thongtin2 = new Scanner(System.in);
        System.out.println("Tuổi nhân viên: ");
        int age = thongtin2.nextInt();
        Scanner thongtin3 = new Scanner(System.in);
        System.out.println("Địa chỉ: ");
        String address = thongtin3.nextLine();
        Scanner thongtin4 = new Scanner(System.in);
        System.out.println("Giới tính: ");
        String gender = thongtin4.nextLine();
        Scanner thongtin5 = new Scanner(System.in);
        System.out.println("Số điện thoại: ");
        String phone = thongtin5.nextLine();
        System.out.println("Email: ");
        String email;
        nhapEmail();
        do {
            email = thongtin.next();
            if (!checkEmail(email))
                System.out.println("Email nhân viên đã tồn tại mời nhập lại");
            continue;
        } while (!checkEmail(email));
        Employee employee = new Employee(id, name, age, address, gender, phone, email);
        emloyeeList.add(employee);


    }


    // xem thông tin
    public void showEmployee() {
        System.out.println(emloyeeList + "\n");
    }


    // sửa thông tin theo id
    public void editEmployee(String id) {
        int i = 0;
        for (Employee edit : emloyeeList
        ) {
            if (edit.getId().equals(id)) {
                System.out.println("Nhập Id mới: ");
                Scanner newInput = new Scanner(System.in);
                String newId = newInput.nextLine();
                edit.setId(newId);
                Scanner newInput1 = new Scanner(System.in);
                System.out.println("Nhập tên mới: ");
                String newName = newInput1.nextLine();
                edit.setName(newName);
                Scanner newInput2 = new Scanner(System.in);
                System.out.println("Nhập tuổi: ");
                int newAge = newInput2.nextInt();
                edit.setAge(newAge);
                Scanner newInput3 = new Scanner(System.in);
                System.out.println("Nhập địa chỉ: ");
                String newAddress = newInput3.nextLine();
                edit.setAddress(newAddress);
                Scanner newInput4 = new Scanner(System.in);
                System.out.println("Nhập giới tính: ");
                String newGender = newInput4.nextLine();
                edit.setGender(newGender);
                Scanner newInput5 = new Scanner(System.in);
                System.out.println("Nhập số điện thoại : ");
                String newPhone = newInput5.nextLine();
                edit.setPhone(newPhone);
                Scanner newInput6 = new Scanner(System.in);
                System.out.println("Nhập email: ");
                String newEmail = newInput6.nextLine();
                edit.setEmail(newEmail);
                System.out.println("Đã xong");
                i++;
            }
            if (i == 0) {
                System.out.println("Sửa không thành công: ");
            }
        }
    }

    // xóa
    public void deleteEmployee(String id) {
        for (int i = 0; i < emloyeeList.size(); i++) {
            if (emloyeeList.get(i).getId().equals(id)) {
                emloyeeList.remove(i);
            }
        }
    }


    //tìm nhân viên theo id
    public void findEmployee(String id) {
        for (Employee check : emloyeeList
        ) {
            if (check.getId().contains(id)) {
                System.out.println(check);

            }
        }

    }

    //chấm công
    public void timeSheet(String id) {
        int i = 0;
        for (Employee edit : emloyeeList
        ) {
            if (edit.getId().equals(id)) {
                System.out.println("Nhập công: ");
                Scanner newCong = new Scanner(System.in);
                i++;
                do {
                    int newCongNgay = newCong.nextInt();

                    if (newCongNgay <= 0) {
                        System.err.println("Yêu cầu nhâp lại công");
                        continue;
                    }
                    edit.setCongNV(newCongNgay);
                } while (!checkCong(newCong));
            }
        }
    }

    // check công qua id
    public void showCong(String id) {
        for (Employee check : emloyeeList
        ) {
            if (check.getId().equals(id)) {
                int a = 0;
                int last = 0;
                for (int i = 0; i < check.getCongNV(); i++) {

                    a += check.getCongNV() + last;
                    last = check.getCongNV();
                }
                System.out.println("Số công: " + a + " ngày");
            }
        }
    }

    // check trùng id
    private boolean checkId(String id) {
        boolean check = true;
        for (Employee checker : emloyeeList
        ) {
            if (checker.getId().equals(id)) check = false;
        }
        return check;
    }

    // check trùng email
    private boolean checkEmail(String email) {
        boolean checkEmail = true;
        for (Employee checker1 : emloyeeList
        ) {
            if (checker1.getId().equals(email)) checkEmail = false;
        }
        return checkEmail;
    }

    private boolean checkCong(Scanner congNV) {
        boolean checkCongNV = true;
        for (Employee checker1 : emloyeeList
        ) {
            if (checker1.getId().equals(congNV)) checkCongNV = false;
        }
        return checkCongNV;
    }


    // tính lương
    public void luong(String id) {
        for (Employee tinhLuong : emloyeeList
        ) {
            if (tinhLuong.getId().equals(id)) {
                int a = tinhLuong.getCongNV() * 8 * 500000;
                System.err.println("Lương của bạn là : " + a + "Vnđ");
            } else if (tinhLuong.getCongNV() <= 0) {
                System.err.println("Bạn bị đuổi việc cmnr! ");
            }
        }
    }
    public void readFile(){
        employees = textFileFactory.readerFile("data1.csv");
    }
    public void writeFile(){
        textFileFactory.saveFile(employees,"data1.csv");
    }
    //check email
    public void nhapEmail(){
        Employee employee = new Employee();
        String email;
        System.out.println("Nhập email mới");
        do {
            email = sc.next();
            if(!CheckInput.validate(email)) System.out.println("Nhập sai định dạng email mời nhập lại");
        }while (!CheckInput.validate(email));
        employee.getEmail(sc.nextLine());
    }
}

