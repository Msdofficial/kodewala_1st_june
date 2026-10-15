package com.kodewala.ecommerce.main;

import java.util.Scanner;
import com.kodewala.ecommerce.ui.MainMenu;

public class EcommerceApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu(sc);

        mainMenu.start();

        sc.close();
    }
}