package ru.skillfactory.tgbot.dataTransferObjects;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/передать значение в поля
@XmlRootElement(name = "GetCursOnDateXmlResult") //Корневой элемент, то есть внутри этого элемента должны быть элементы, которые указаны как поля
@Data //генерируем геттеры и сеттеры
public class GetCursOnDateXmlResult {

    @XmlElementWrapper(name = "ValuteData", namespace = "")
    @XmlElement(name = "ValuteCursOnDate", namespace = "")
    private List<ValuteCursOnDate> valuteData = new ArrayList<>();
}