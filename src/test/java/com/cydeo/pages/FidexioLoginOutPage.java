package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioLoginOutPage {

    public FidexioLoginOutPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement loginInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".btn-primary")
    public WebElement loginButton;

    @FindBy(css = ".btn-link")
    public WebElement btnLink;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement oChannelNameSpan;

    @FindBy(css = "p")
    public WebElement alert;

    @FindBy(id = "top_menu")
    public WebElement topMenuUl;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement oeLoginForm;

    @FindBy(xpath = "//label[.='Your Email']")
    public WebElement oeResetPasswordForm;

    @FindBy(css = ".oe_topbar_name")
    public WebElement oeTopbarNameSpan;

    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logoutLink;

    @FindBy(xpath = "//h4[.]")
    public WebElement odooSessionExpired;

    @FindBy(xpath = "//b")
    public WebElement SingInLink;

    @FindBy(xpath = "//input[@name='redirect']")
    public WebElement redirectInput;





    @FindBy(css = "span")
    public WebElement CopyRight;

   


















}
