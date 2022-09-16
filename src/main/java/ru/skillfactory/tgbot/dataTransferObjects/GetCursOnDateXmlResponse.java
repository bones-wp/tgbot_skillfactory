package ru.skillfactory.tgbot.dataTransferObjects;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetCursOnDateXMLResponse", namespace = "https://web.cbr.ru/") //Указываем XML тег и пространство имен
@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/записать значения в поля данного объекта
@Data //Генерируем геттеры и сеттеры
public class GetCursOnDateXmlResponse {

    @XmlElement(name = "GetCursOnDateXMLResult", namespace = "https://web.cbr.ru/") //Имя xml элемента и его пространство имен
    private GetCursOnDateXmlResult getCursOnDateXmlResult;
}
