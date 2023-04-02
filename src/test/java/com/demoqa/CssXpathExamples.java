package com.demoqa;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void CssXpathExample() {
        // <input type="email" class="inputtext login_form_input_box" name="email" data-testid="email">
        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//input[@id='email']").setValue("1");
        $(byXpath("//input[@id='email']")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(".inputtext.login_form_input_box").setValue("1"); //тут нет пробела между классами
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][@class='login_form_input_box']").setValue("1");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box").setValue("1"); //а тут есть пробел, потому что родительский элемент
        $("div.inputtext input.login_form_input_box").setValue("1");
        $("div.inputtext").$("input.login_form_input_box").setValue("1");

        //<div>Hello there</div>
        $x("/div[text()='Hello there']").click();
        $(byText("Hello there")).click();
        $(withText("ello the")).click();
    }
}
