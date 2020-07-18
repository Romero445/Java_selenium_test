package test.login_test.positive;

import org.junit.jupiter.api.Test;
import test.base.BaseTest;

import static constants.Constants.LoginTestData.LOGIN;
import static constants.Constants.LoginTestData.PASSWORD;
import static constants.Constants.Urls.LOGIN_URL;

public class LoginTest extends BaseTest {
    @Test
    public void checkLogin() {
        basePage.goToUrl(LOGIN_URL);
        loginPage
                .clickBtnL()
                .enterLogin(LOGIN)
                .enterPassword(PASSWORD)
                .pushLogin()
                .userInfoPresent("0 GMS");
    }
}
