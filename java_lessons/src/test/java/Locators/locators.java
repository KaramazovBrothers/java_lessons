package Locators;

import org.openqa.selenium.By;

public class locators {

    By TwitLink = By.partialLinkText("Twit");  //Локатор для ссылки на Twitter
    By twitterLink = By.linkText("Twitter"); //Локатор для ссылки на Facebook в футтере на частичному тексту
    By select = By.tagName("select");  //Локатор по тегу для выпадающего списка фильтров
    By title = By.className("title"); //С помощью By.className написать локатор для элемента Products
    By name = By.name("checkout"); //с помощью локатора By.name найти кнопку Checkout
    By id = By.id("add-to-cart-sauce-labs-backpack");//с помощью локатора By.id найти элементы для добавления продукта
    By allElemets = By.cssSelector("*"); //локатор для получения всех элемнтов на странице
    By idButtonAddCard = By.cssSelector("#add-to-cart-sauce-labs-backpack");//локатор для нажождения кнопок добавления в корзину по айди
    By allbuttonInDiv = By.cssSelector("#header_container button"); // локатор для нахождения всех кнопок внутри элемента с id = header_container
    By inventoryNameClass = By.cssSelector(".inventory_item_name"); //локатор для названий продуктов
    By addToCardWithCss = By.cssSelector("button[data-test]"); //локатор для нахождения элементов добавить в корзину по атрибуту

    //А теперь поиспользуем XPath

    By fullText = By.xpath("//a[text()='Twitter']");
    By partText = By.xpath("//a[contains(text(),'Face')]");
    By tag = By.xpath("//select");
    By atrName = By.xpath("//button[@name='checkout']");
    By idXpath = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By allXpath = By.xpath("//*");
    By index = By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[2]");
    By or = By.xpath("//div[@class='inventory_item_label' or @class='inventory_item_img']");
    By and = By.xpath("//button[contains(@class,'btn_primary') and contains(@name,'add-to-cart-sauce-labs-onesie')]");
    By axesButton = By.xpath("//div[@class='inventory_item_price']/following::button");
    By axesPrice = By.xpath("//button/following::div[@class='inventory_item_price']");
    
}
