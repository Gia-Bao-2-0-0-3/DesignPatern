package adapter;
/*
 * @description
 * @author: Nguyễn Gia Bảo
 * @date:   Mar 11, 2025
 * @version: 1.0
 */
public class TranslatorAdapter implements VietnameseTarget {
	 
    private JapaneseAdaptee adaptee;
 
    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }
 
    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }
 
    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}