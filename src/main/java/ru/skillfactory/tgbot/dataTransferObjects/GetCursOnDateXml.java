package ru.skillfactory.tgbot.dataTransferObjects;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
public class GetCursOnDateXml {
    @XmlElement(name = "On_Date", required = true, namespace = "http://web.cbr.ru/") //Указание на то, в каком теге XML должно быть данное поле
    protected XMLGregorianCalendar onDate;
}
