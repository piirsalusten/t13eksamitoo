package com.webtest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;

public class loginTest {
    public static void main(String[] args){
        open("http://greeny.cs.tlu.ee/~piirsten/prpohi/kodutood/t13eksamitoo/index.php");
        $("loginEmail").setValue("webTest@email.com");
        $("loginPassword").setValue("webTestpa$$word");
        $("#signinButton").click();
        $("#notice").shouldHave(text("Kõik korras! Logisimegi sisse!"));
    }
}