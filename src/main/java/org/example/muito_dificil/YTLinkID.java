package org.example.muito_dificil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YTLinkID {
    public String extractor(String ytUrl){

        String pattern = "(?<=youtu.be/|watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(ytUrl);

        if(matcher.find()){
            return matcher.group();
        } else{
            return "Error";
        }
    }
}
