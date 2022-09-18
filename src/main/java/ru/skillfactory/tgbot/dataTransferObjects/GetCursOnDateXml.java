package ru.skillfactory.tgbot.dataTransferObjects;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@Data
public class GetCursOnDateXml {

    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;

}
