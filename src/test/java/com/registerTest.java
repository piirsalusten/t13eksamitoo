package com.webtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class registerTest {
    public static void main(String[] args){
        open("http://greeny.cs.tlu.ee/~piirsten/prpohi/kodutood/t13eksamitoo/register.php");
        $("signupFirstName").setValue("Juhan");
        $("signupFamilyName").setValue("Test");
        $("signupFamilyName").setValue("Test");
        $("signupFamilyName").setValue("Test");
        $("#signinButton").click();
        $("#notice").shouldHave(text("Kõik korras! Logisimegi sisse!"));



        $("#result").shouldHave(text(""));

    }
}