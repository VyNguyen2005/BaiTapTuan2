/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        String id1, name1;
        int balance1;
        String id2, name2;
        int balance2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id tai khoan myAccount: ");
        id1 = sc.nextLine();
        System.out.print("Nhap ten tai khoan myAccount: ");
        name1 = sc.nextLine();
        System.out.print("Nhap so du tai khoan myAccount: ");
        balance1 = sc.nextInt();
        
        Account myAccount = new Account(id1, name1, balance1);
        
        System.out.print("Nhap id tai khoan yourAccount: ");
        id2 = sc.nextLine();
        System.out.print("Nhap ten tai khoan yourAccount: ");
        name2 = sc.nextLine();
        System.out.print("Nhap so du tai khoan yourAccount: ");
        balance2 = sc.nextInt();
        
        Account yourAccount = new Account(id2, name2, balance2);
        
        System.out.println("---THONG TIN TAI KHOAN BAN DAU---");
        ExportInfo(myAccount);
        System.out.println("");
        ExportInfo(yourAccount);
        
        
        
    }
    public static void ExportInfo(Account account){
        System.out.print("Id = " +account.getId() + ", Name = " +account.getName() + ", Balance = " +account.getBalance());
    }
}
