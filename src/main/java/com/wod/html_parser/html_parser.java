package com.wod.html_parser;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class html_parser{
    public html_parser() {
        
    };

    public String polacz(Number year, Number month, Number day) throws IOException{
        Document doc = Jsoup.connect("https://www.crossfit.com/workout/" + year + "/" + month + "/" + day + "/").get();
        /*String txt = doc.body().text();*/
        String txt = "<div><strong>" + year + "/" + month + "/" + day + "</strong><hr>" + doc.getElementsByClass("content").outerHtml() + "</div>";
        return txt;
    };
};