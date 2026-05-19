import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator password;

    @BeforeEach
    void newPass() {
        password = new PasswordValidator(8, true);
        System.out.println("Создан новый пароль для теста.");
    }
    @Test
    void testCorrectPass(){
        boolean result = password.validate("pass1234");
        Assertions.assertTrue(result, "Пароль 'pass1234' должен быть валидным");

        System.out.println("Тест пароля пройден");
    }

    @Test
    void Too_muchShortPass(){
        boolean result = password.validate("pass");
        assertFalse(result);

        System.out.println("Тест пароля не пройден");
    }
    }