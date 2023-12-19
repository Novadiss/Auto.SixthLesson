package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import org.w3c.dom.Text;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashbordPage {
    private final String balanceStart = "баланс: ";
    private final String balanceFinish = " р.";
    private final SelenideElement heading = $("[data-test-id=dashboard]");
    private final ElementCollection cards = $$(".list__item div");

    public DashboardPage() {
        heading.shouldBe(visible);
    }

    public int getCardBalance(DataHelper.CardInfo cardInfo){
        var text = cards.findBy(text(cardInfo.getCardNumber().substring(15))).getText();
    return extracts
    }
}
