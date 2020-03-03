package ocr.exercice.cardviewandrecyclerstep2;

public class CardViewItem {

    private int mImageRsrcCovertImg1;
    private String mTextView1NewspaperName;
    private String mTextView2ContentNews;
    private String mTextView3AuthorName;
    private String mTextView4Date;
    private String mTextView5Hour;


    public CardViewItem(int imageRsrcCovertImg1, String textView1NewspaperName, String textView2ContentNews, String textView3AuthorName, String textView4Date, String textView5Hour) {
        this.mImageRsrcCovertImg1 = imageRsrcCovertImg1;
        this.mTextView1NewspaperName = textView1NewspaperName;
        this.mTextView2ContentNews = textView2ContentNews;
        this.mTextView3AuthorName = textView3AuthorName;
        this.mTextView4Date = textView4Date;
        this.mTextView5Hour = textView5Hour;
    }

    public int getmImageRsrcCovertImg1() {
        return mImageRsrcCovertImg1;
    }

    public String getmTextView1NewspaperName() {
        return mTextView1NewspaperName;
    }

    public String getmTextView2ContentNews() {
        return mTextView2ContentNews;
    }

    public String getmTextView3AuthorName() {
        return mTextView3AuthorName;
    }

    public String getmTextView4Date() {
        return mTextView4Date;
    }

    public String getmTextView5Hour() {
        return mTextView5Hour;
    }
}
