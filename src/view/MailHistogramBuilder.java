package view;

import java.util.Iterator;
import java.util.List;
import model.Mail;
import model.Histogram;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histogram = new Histogram();
        for (Iterator<Mail> it = list.iterator(); it.hasNext();) {
            Mail element = it.next();
            histogram.increment(element.getDomain());
        }
        
        return histogram;
    }
}
